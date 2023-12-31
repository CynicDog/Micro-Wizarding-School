package com.cynicdog.userservice.controller;

import com.cynicdog.userservice.entity.User;
import com.cynicdog.userservice.service.UserService;
import org.jboss.logging.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/user")
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class);

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // http GET http://localhost:8072/user/v1/user/HarryJamesPotter
    @RequestMapping(value = "/{fullName}", method = RequestMethod.GET)
    public ResponseEntity userByFullName(@PathVariable("fullName") String fullName) {

        logger.info("[ UserController - fetching an instance of `User` with the full name of " + fullName + " ]");
        User found = userService.getUserByFullName(fullName);

        if (found != null) {
            return ResponseEntity.ok().body(found);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    // http GET 'http://localhost:8072/user/v1/user?houseTitle=Gryffindor'
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity houseAvailability(@RequestParam("houseTitle") String houseTitle) {

        logger.info("[ UserController - querying if House with the tittle of " + houseTitle + " ]");

        if (userService.isHouseAvailable(houseTitle)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
