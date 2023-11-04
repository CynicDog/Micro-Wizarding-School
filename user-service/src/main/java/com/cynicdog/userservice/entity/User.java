package com.cynicdog.userservice.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;

    @CreationTimestamp
    private Date joinedDate;

    @Enumerated(EnumType.STRING)
    private ROLE role;

    public enum ROLE {
        STUDENT, PROFESSOR
    }

    public User() {
    }

    public User(String firstName, String middleName, String lastName, Date joinedDate, String role) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.joinedDate = joinedDate;
        this.role = ROLE.valueOf(role);
    }
}