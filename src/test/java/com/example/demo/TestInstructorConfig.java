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
public class TestInstructorConfig {
    
    @Autowired
    @Qualifier("instructors")
    private Instructors instructors;

    @Autowired
    @Qualifier("tcUsaInstructors")
    private Instructors tcUsaInstructors;

    @Autowired
    @Qualifier("tcUkInstructors")
    private Instructors tcUkInstructors;

    @Test
    public void testInstructors() {
        Assert.assertNotNull(instructors);
        Assert.assertEquals(4, instructors.size());
    }

    @Test
    public void testtcUsaInstructors() {
        Assert.assertNotNull(tcUsaInstructors);
        Assert.assertEquals(2, tcUsaInstructors.size());
    }

    @Test
    public void testtcUkInstructors() {
        Assert.assertNotNull(tcUkInstructors);
        Assert.assertEquals(2, tcUkInstructors.size());
    }
}
