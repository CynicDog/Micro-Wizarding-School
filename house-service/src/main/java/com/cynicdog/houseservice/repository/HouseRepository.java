package com.cynicdog.houseservice.repository;

import com.cynicdog.houseservice.domain.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {

    Optional<House> findByTitle(House.TITLE title);
}
