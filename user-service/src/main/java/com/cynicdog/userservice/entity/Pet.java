package com.cynicdog.userservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Pet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;

    public Pet() {
    }

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }
}
