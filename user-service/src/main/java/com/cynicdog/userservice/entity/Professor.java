package com.cynicdog.userservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Professor extends User {

    @Column(unique = true)
    private String subject;

    @Column(unique = true)
    private String position;

    public Professor() {
    }

    public Professor(String firstName, String middleName, String lastName, Date joinedDate, String role, String subject, String position) {
        super(firstName, middleName, lastName, joinedDate, role);
        this.subject = subject;
        this.position = position;
    }
}
