package com.example.demo;

import java.util.Collection;

public class Instructor extends Person implements Teacher {
    
    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
    int size = ((Collection<?>) learners).size();
    double numberOfHoursPerLearner = numberOfHours / size;
    for (Learner learner : learners) {
        learner.learn(numberOfHoursPerLearner);
        }
    }
}
