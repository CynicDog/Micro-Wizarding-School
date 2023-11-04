package com.cynicdog.userservice.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Getter
@Setter
@Entity
public class Student extends User {

    private String houseTitle;

    @OneToOne
    @Cascade(CascadeType.ALL)
    private Pet pet;

    public Student() {
    }

    public Student(String firstName, String middleName, String lastName, String wand, Date joinedDate, String role, String houseTitle, Pet pet) {
        super(firstName, middleName, lastName, wand, joinedDate, role);
        this.houseTitle = houseTitle;
        this.pet = pet;
    }
}
