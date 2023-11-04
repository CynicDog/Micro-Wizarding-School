package com.cynicdog.houseservice.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class House {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer quota = 250;

    public House() {
    }

    public House(String title) {
        this.title = title;
    }
}
