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
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student demo = new Student(
                    "DemoApplication",
                    "demo@spring.com",
                    LocalDate.of(2020, Month.OCTOBER, 19)
            );

            repository.save(demo);
        };
    }
}
