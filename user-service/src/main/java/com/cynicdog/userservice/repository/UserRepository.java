package com.cynicdog.userservice.repository;

import com.cynicdog.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByFirstNameAndMiddleNameAndLastName(String FirstName, String MiddleName, String LastName);

}
