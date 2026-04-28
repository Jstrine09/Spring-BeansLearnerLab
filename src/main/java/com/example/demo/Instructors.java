package com.example.demo;

public class Instructors extends People<Instructor> {
    public Instructors() {
        super();
    }

    public Instructors(Instructor... instructors) {
        super(instructors);
    }
}
