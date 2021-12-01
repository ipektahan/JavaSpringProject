package com.example.demo.service;

import com.example.demo.data.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.repository.LectureRepository;
import com.example.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class studentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
//   private final LectureRepository lectureRepository;

    @Override
    @Transactional
    public StudentDto save(StudentDto studentDto) {
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setSurname(studentDto.getSurname());
        student.setUniversity(studentDto.getUniversity());
        student.setDeleted(false);
        final Student studentDb = studentRepository.save(student);
        studentDto.setPkid(studentDb.getPkid());
        return studentDto;
    }

    @Override
    public List<StudentDto> getAll() {

        List<Student> students = studentRepository.findAll();

        List<StudentDto> studentDtos = new ArrayList<>();

        students.forEach(item -> {

            StudentDto studentDto = new StudentDto();
            if (item.getDeleted() == false) {
                studentDto.setPkid(item.getPkid());
                studentDto.setName(item.getName());
                studentDto.setSurname(item.getSurname());
                studentDto.setUniversity(item.getUniversity());
                studentDto.setDeleted(item.getDeleted());
                studentDtos.add(studentDto);
            }


        });
        return studentDtos;
    }

    @Override
    public Page<StudentDto> getAll(Pageable pageable) {

        return null;
    }


    @Override
    public String deleteStudent(Long id) {
        Student student = studentRepository.findById(id).orElse(null);
        assert student != null;
        student.setDeleted(true);
        return ("ok");

    }


}

