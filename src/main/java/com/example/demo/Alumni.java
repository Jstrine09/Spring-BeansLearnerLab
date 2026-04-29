package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alumni {
    
    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    public Alumni() {
    }

    public Students getPreviousStudents() {
        return previousStudents;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    @PostConstruct
    public void executeBootCamp() {
        int numberOfInstructors = instructors.size();
        int numberOfStudents = previousStudents.size();
        double numberOfHoursToTeachEachStudent = 1200;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;
    for (Instructor instructor : instructors) {
        instructor.lecture(previousStudents, numberOfHoursPerInstructor);
        }
    }
}
