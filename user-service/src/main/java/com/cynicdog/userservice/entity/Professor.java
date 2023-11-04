package com.cynicdog.userservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@Entity
public class Professor extends User {

    @Column(unique = true)
    private String subject;

    @Column(unique = true)
    private String position;

    public Professor() {
    }

    public Professor(String firstName, String middleName, String lastName, String wand, Date joinedDate, String role, String subject, String position) {
        super(firstName, middleName, lastName, wand, joinedDate, role);
        this.subject = subject;
        this.position = position;
    }
}
