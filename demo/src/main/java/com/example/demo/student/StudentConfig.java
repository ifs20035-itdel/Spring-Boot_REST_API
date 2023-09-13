package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student michael = new Student(
                    "Michael",
                    "asm34686@gmail.com",
                    LocalDate.of(2002, Month.APRIL, 23)
            );
            Student albert = new Student(
                    "Albert",
                    "forcealbert@gmail.com",
                    LocalDate.of(2002, Month.APRIL, 23)
            );
            Student sholay = new Student(
                    "Sholay",
                    "napitupulumichael@outlook.com",
                    LocalDate.of(2002, Month.APRIL, 23)
            );

            repository.saveAll(
                    List.of(michael, albert, sholay)
            );
        };
    }
}
