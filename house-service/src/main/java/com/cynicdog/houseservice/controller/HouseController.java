package com.cynicdog.houseservice.controller;

import com.cynicdog.houseservice.domain.House;
import com.cynicdog.houseservice.service.HouseService;
import org.jboss.logging.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/house")
public class HouseController {

    private static final Logger logger = Logger.getLogger(HouseController.class);

    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    // http GET http://localhost:8072/house/v1/house/Gryffindor
    @RequestMapping(value = "/{houseTitle}", method = RequestMethod.GET)
    public ResponseEntity house(@PathVariable String houseTitle) {

        House found = houseService.getHouseByTitle(houseTitle);

        if (found != null) {
            logger.info("[ HouseController - found House with the title of " + houseTitle + " ] - (" + found.getTitle() + ")");
            return ResponseEntity.ok().body(found);
        } else {
            logger.info("[ HouseController - couldn't find House with the title of " + houseTitle + " ]");
            return ResponseEntity.badRequest().build();
        }
    }
}