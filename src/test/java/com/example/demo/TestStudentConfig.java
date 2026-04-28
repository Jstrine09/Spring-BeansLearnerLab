package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestStudentConfig {

    @Autowired
    @Qualifier("students")
    private Students students;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Test
    public void testCurrentStudents() {
        Assert.assertNotNull(students);
        Assert.assertEquals(3, students.size());
    }

    @Test
    public void testPreviousStudents() {
        Assert.assertNotNull(previousStudents);
        Assert.assertEquals(3, previousStudents.size());
    }
}