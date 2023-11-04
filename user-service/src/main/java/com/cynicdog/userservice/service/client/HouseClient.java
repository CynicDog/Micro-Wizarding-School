package com.cynicdog.userservice.service.client;

import com.cynicdog.userservice.model.House;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class HouseClient {

    private final RestTemplate restTemplate;

    public HouseClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public House getHouseByTitle(String houseTitle) {

        ResponseEntity<House> response =
                restTemplate.exchange(
                        "http://house-service/v1/house/{houseTitle}",
                        HttpMethod.GET,
                        null,
                        House.class,
                        houseTitle
                );

        return response.getBody();
    }
}
