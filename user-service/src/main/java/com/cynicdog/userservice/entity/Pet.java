package com.cynicdog.userservice.entity;

import javax.persistence.*;

@Entity
public class Pet {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    @Enumerated(EnumType.STRING)
    private TYPE type;

    public enum TYPE {
        CAT, OWL, TOAD
    }

    public Pet() {
    }

    public Pet(String name, Integer age, String type) {
        this.name = name;
        this.age = age;
        this.type = TYPE.valueOf(type);
    }
}
