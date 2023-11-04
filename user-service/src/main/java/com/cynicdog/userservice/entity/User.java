package com.cynicdog.userservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "firstName", "middleName", "lastName" }))
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;

    @Column(unique = true)
    private String wand;

    @CreationTimestamp
    private Date joinedDate;

    private String role;

    public User() {
    }

    public User(String firstName, String middleName, String lastName, String wand, Date joinedDate, String role) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.wand = wand;
        this.joinedDate = joinedDate;
        this.role = role;
    }
}