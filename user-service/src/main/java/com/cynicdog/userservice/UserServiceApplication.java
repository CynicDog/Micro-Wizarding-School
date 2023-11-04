package com.cynicdog.userservice;

import com.cynicdog.userservice.entity.Pet;
import com.cynicdog.userservice.entity.Student;
import com.cynicdog.userservice.service.UserService;
import org.jboss.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.Date;

@EnableEurekaClient
@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner {

    private static final Logger logger = Logger.getLogger(UserServiceApplication.class);
    private final UserService userService;

    public UserServiceApplication(UserService userService) {
        this.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        logger.info("[ UserService - initial data insertion ... ] ");

        Student harry = new Student(
                "Harry", "James", "Potter",
                "11' long, made of holly, and possessed a phoenix feather core",
                new Date(),
                "Student",
                "Gryffindor",
                new Pet("Hedwig", "Owl"));

        userService.insertStudent(harry);
    }
}
