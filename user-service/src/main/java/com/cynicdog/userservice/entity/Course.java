package com.cynicdog.userservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Course {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToOne
    private Professor professor;

    private Integer quota;
    private Date openedDate;
    private Date closedDate;

    public Course() {
    }

    public Course(String title, Professor professor, Integer quota, Date openedDate, Date closedDate) {
        this.title = title;
        this.professor = professor;
        this.quota = quota;
        this.openedDate = openedDate;
        this.closedDate = closedDate;
    }
}
