package com.cynicdog.userservice.repository;

import com.cynicdog.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByFirstNameAndMiddleNameAndLastName(String FirstName, String MiddleName, String LastName);

    @Query("SELECT COUNT(s) FROM User u JOIN Student s ON u.id = s.id WHERE s.houseTitle = :houseTitle")
    long countByHouseTitle(@Param("houseTitle") String houseTitle);
}
