package com.cynicdog.userservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Getter
@Setter
@Entity
public class Student extends User {

    private String houseTitle;
    private Integer academicYear;

    @Column(unique = true)
    private String wand;

    @OneToOne
    private Pet pet;

    public Student() {
    }

    public Student(String firstName, String middleName, String lastName, Date joinedDate, String role, String houseTitle, Integer academicYear, String wand, Pet pet) {
        super(firstName, middleName, lastName, joinedDate, role);
        this.houseTitle = houseTitle;
        this.academicYear = academicYear;
        this.wand = wand;
        this.pet = pet;
    }

}
