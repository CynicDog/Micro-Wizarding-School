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
    private Integer age;
    private String type;

    public Pet() {
    }

    public Pet(String name, Integer age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
}
