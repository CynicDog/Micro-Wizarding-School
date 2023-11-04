package com.cynicdog.houseservice.service;

import com.cynicdog.houseservice.domain.House;
import com.cynicdog.houseservice.repository.HouseRepository;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

@Service
public class HouseService {

    private static final Logger logger = Logger.getLogger(HouseService.class);

    private final HouseRepository houseRepository;

    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public House getHouseByTitle(String houseTitle) {

        return houseRepository.findByTitle(House.TITLE.valueOf(houseTitle)).orElse(null);
    }
}
