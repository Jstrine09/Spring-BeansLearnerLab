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
public class TestAlumni {
    
    @Autowired
    private Alumni alumni;

    @Autowired
    @Qualifier("previousStudents")
    private Students previousStudents;

    @Test
    public void testPreviousStudents() {
        Assert.assertNotNull(previousStudents);
        Assert.assertEquals(3, previousStudents.size());
    }

    @Test
    public void testNumberOfHoursTaught() {
        for (Student student : previousStudents) {
            Assert.assertEquals(1200.0, student.getTotalStudyTime(), 0.0);
        }
    }
}
