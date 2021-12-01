package com.example.demo.service;

import com.example.demo.data.StudentDto;
import com.example.demo.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface StudentService {

    StudentDto save(StudentDto studentDto);

    List<StudentDto> getAll ();

    Page<StudentDto> getAll(Pageable pageable);

    String deleteStudent(Long id);
}
