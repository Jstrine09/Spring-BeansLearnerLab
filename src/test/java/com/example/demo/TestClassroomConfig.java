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
public class TestClassroomConfig {
    
    @Autowired
    @Qualifier("currentCohort")
    private Classroom currentCohort;

    @Autowired
    @Qualifier("previousCohort")
    private Classroom previousCohort;

    @Test
    public void testCurrentCohort() {
        Assert.assertNotNull(currentCohort);
        Assert.assertEquals(4, currentCohort.getInstructors().size());
        Assert.assertEquals(3, currentCohort.getStudents().size());
    }

    @Test
    public void testPreviousCohort() {
        Assert.assertNotNull(previousCohort);
        Assert.assertEquals(4, previousCohort.getInstructors().size());
        Assert.assertEquals(3, previousCohort.getStudents().size());
    }
}
