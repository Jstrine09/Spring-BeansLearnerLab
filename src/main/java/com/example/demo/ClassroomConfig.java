package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {
    
    public ClassroomConfig() {
    }

    @Bean(name = "currentCohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(Instructors instructors, Students students) {
        return new Classroom(instructors, students);
    }

    @Bean(name = "previousCohort")
    @DependsOn({"instructors", "previousStudents"})
    public Classroom previousCohort(Instructors instructors, 
        @Qualifier("previousStudents") Students previousStudents) {
        return new Classroom(instructors, previousStudents);
}
}
