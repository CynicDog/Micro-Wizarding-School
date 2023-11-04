package com.cynicdog.houseservice;

import com.cynicdog.houseservice.domain.House;
import com.cynicdog.houseservice.repository.HouseRepository;
import org.jboss.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HouseServiceApplication implements CommandLineRunner {

    private static final Logger logger = Logger.getLogger(HouseServiceApplication.class);
    private final HouseRepository houseRepository;

    public HouseServiceApplication(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(HouseServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("[ HouseRepository - initial data settings.. ]");

        // Gryffindor, Hufflepuff, Ravenclaw, Slytherin
        houseRepository.save(new House("Gryffindor"));
        houseRepository.save(new House("Hufflepuff"));
        houseRepository.save(new House("Ravenclaw"));
        houseRepository.save(new House("Slytherin"));
    }
}
