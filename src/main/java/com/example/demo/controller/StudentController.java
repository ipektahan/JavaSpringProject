package com.example.demo.controller;

import com.example.demo.data.StudentDto;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    @RequestMapping(value = "/save")
    public ResponseEntity<StudentDto> saveStudent(@RequestBody StudentDto studentDto) {
        return ResponseEntity.ok(studentService.save(studentDto));
    }

    @GetMapping
    @RequestMapping(value = "/filter")
    public ResponseEntity<List<StudentDto>> getAllStudents() {

        return ResponseEntity.ok(studentService.getAll());
    }

    @PostMapping
    @RequestMapping(value = "/delete")
    public ResponseEntity<String> deleteSt(@RequestBody Long id) {

        return ResponseEntity.ok(studentService.deleteStudent(id));


    }


}
