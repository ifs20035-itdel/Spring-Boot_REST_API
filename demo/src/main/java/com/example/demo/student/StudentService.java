package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Michael",
                        "asm34686@gmail.com",
                        21,
                        LocalDate.of(2002, Month.APRIL, 23)
                )
        );
    }
}
