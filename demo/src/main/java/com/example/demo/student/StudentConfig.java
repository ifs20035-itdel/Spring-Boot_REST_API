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
            Student dragni = new Student(
                    "dragon",
                    "lampid@empire.com",
                    LocalDate.of(1663, Month.JANUARY, 10)
            );
            Student albert = new Student(
                    "Albert",
                    "bruh@code.com",
                    LocalDate.of(2010, Month.FEBRUARY, 22)
            );
            Student muahala = new Student(
                    "Muahala",
                    "needforSpeed@outlook.com",
                    LocalDate.of(1997, Month.JUNE, 11)
            );

            repository.saveAll(
                    List.of(dragni, albert, muahala)
            );
        };
    }
}
