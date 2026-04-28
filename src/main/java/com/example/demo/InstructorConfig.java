package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorConfig {
    
    public InstructorConfig() {
    }

    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        return new Instructors(
            new Instructor(1L, "Dr. Smith"),
            new Instructor(2L, "Dr. Johnson")
        );
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors() {
        return new Instructors(
            new Instructor(3L, "Dr. Brown"),
            new Instructor(4L, "Dr. Taylor")
        );
    }

    @Primary
    @Bean(name = "instructors")
    public Instructors instructors() {
        return new Instructors(
            new Instructor(1L, "Dr. Smith"),
            new Instructor(2L, "Dr. Johnson"),
            new Instructor(3L, "Dr. Brown"),
            new Instructor(4L, "Dr. Taylor")
        );
    }
}
