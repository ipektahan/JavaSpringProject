package com.example.demo.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_student_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_student_id", strategy = GenerationType.SEQUENCE)
    private Long pkid;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "university_id")
    private int university;

    @Column(name = "deleted")
    private Boolean deleted;


    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Student(Long pkid) {
        this.pkid = pkid;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int university) {
        this.university = university;
    }

    public Long getPkid() {
        return pkid;
    }

    public void setPkid(Long pkid) {
        this.pkid = pkid;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUniversity() {
        return university;
    }

    public void setUniversity(int university) {
        this.university = university;
    }

    public Student() {

    }

    public Student(Long pkid, String name, String surname, int university, Boolean deleted) {
        this.pkid = pkid;
        this.name = name;
        this.surname = surname;
        this.university = university;
        this.deleted = deleted;
    }


}
