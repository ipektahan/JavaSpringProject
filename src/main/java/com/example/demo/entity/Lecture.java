package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="Lecture" )
public class Lecture implements Serializable {
    @Id
    @SequenceGenerator(name="seq_lecture_id",allocationSize = 1)
    @GeneratedValue(generator = "seq_lecture_id",strategy = GenerationType.SEQUENCE)
    @Column(name = "pkid",nullable = false)
    private Long pkid;

    @Column(name = "lecture_name",length = 500)
    private String lecture_name;

    @Column(name = "uni")
    private int university;

    @Column(name = "is_active")
    private Boolean is_active;

    public Lecture(Long pkid) {
        this.pkid = pkid;
    }

    public Lecture(Boolean is_active) {
        this.is_active = is_active;
    }

    public Lecture(int university) {
        this.university = university;
    }

    public Lecture(String lecture_name) {
        this.lecture_name = lecture_name;
    }

    public Lecture() {

    }

//    public Long getPkid() {
//        return pkid;
//    }

//    public void setPkid(Long pkid) {
//        this.pkid = pkid;
//    }

    public String getLecture_name() {
        return lecture_name;
    }

    public void setLecture_name(String lecture_name) {
        this.lecture_name = lecture_name;
    }

    public int getUniversity() {
        return university;
    }

    public void setUniversity(int university) {
        this.university = university;
    }

    public Boolean getIs_active() {
        return is_active;
    }

    public void setIs_active(Boolean is_active) {
        this.is_active = is_active;
    }
}
