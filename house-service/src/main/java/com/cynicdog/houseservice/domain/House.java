package com.cynicdog.houseservice.domain;


import javax.persistence.*;

@Entity
public class House {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TITLE title;

    private int quota = 250;

    public enum TITLE {
        Gryffindor, Hufflepuff, Ravenclaw, Slytherin
    }

    public House() {
    }

    public House(String title) {
        this.title = TITLE.valueOf(title);
    }

    public Long getId() {
        return id;
    }

    public TITLE getTitle() {
        return title;
    }

    public void setTitle(TITLE title) {
        this.title = title;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }
}
