package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    public StudentConfig() {
    }

    @Bean(name = "students")
    public Students currentStudents() {
        return new Students(
        new Student(1L, "Leonard"),
        new Student(2L, "Sheldon"),
        new Student(3L, "Penny")
        );
    }
}
