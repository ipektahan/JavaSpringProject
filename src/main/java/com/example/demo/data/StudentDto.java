package com.example.demo.data;

import com.example.demo.entity.Lecture;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class StudentDto {

    private Long pkid;

    private String name;

    private String surname;

    private int university;

    private Boolean deleted;
}
