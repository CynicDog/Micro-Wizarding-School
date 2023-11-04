package com.cynicdog.userservice;

import com.cynicdog.userservice.entity.Pet;
import com.cynicdog.userservice.entity.Student;
import com.cynicdog.userservice.repository.UserRepository;
import com.cynicdog.userservice.service.UserService;
import org.jboss.logging.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@EnableEurekaClient
@SpringBootApplication
public class UserServiceApplication implements CommandLineRunner {

    private static final Logger logger = Logger.getLogger(UserServiceApplication.class);
    private final UserRepository userRepository;

    public UserServiceApplication(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @LoadBalanced @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
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

        userRepository.save(harry);
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }
}
