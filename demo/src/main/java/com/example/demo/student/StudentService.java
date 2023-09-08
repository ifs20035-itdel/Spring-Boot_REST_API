package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
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
