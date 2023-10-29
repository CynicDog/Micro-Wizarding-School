package com.cynicdog.houseservice.domain;


import javax.persistence.*;

@Entity
public class House {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private HOUSE_TITLE houseTitle;

    private int quota = 250;

    public enum HOUSE_TITLE {
        Gryffindor, Hufflepuff, Ravenclaw, Slytherin
    }
}
