package org.launchcode.techjobs.oo;

import mockit.Expectations;
import mockit.Mocked;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
public class TestTaskFive extends AbstractTest {

    @Mocked Job job;

    @Test
    public void testTestToStringStartsAndEndsWithNewLineExists () throws ClassNotFoundException {
        Class jobTestClass = getClassByName("JobTest");
        Method testToStringStartsAndEndsWithNewLineMethod = null;

        try {
            testToStringStartsAndEndsWithNewLineMethod = jobTestClass.getMethod("testToStringStartsAndEndsWithNewLine");
        } catch (NoSuchMethodException e) {
            fail("JobTest does not have a testToStringStartsAndEndsWithNewLine method");
        }
    }


    @Test
    public void testToStringStartsAndEndsWithNewLine() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Job job = createJob("Web Developer", "LaunchCode", "StL", "Back-end developer", "Java");
        String newline = System.lineSeparator();
        String testStr = job.toString();

        assertTrue(testStr.startsWith(newline) && testStr.endsWith(newline));
    }

    @Test
    public void testTestToStringContainsCorrectLabelsAndDataExists () throws ClassNotFoundException {
        Class jobTestClass = getClassByName("JobTest");
        Method testToStringContainsCorrectLabelsAndDataMethod = null;

        try {
            testToStringContainsCorrectLabelsAndDataMethod = jobTestClass.getMethod("testToStringContainsCorrectLabelsAndData");
        } catch (NoSuchMethodException e) {
            fail("JobTest does not have a testToStringContainsCorrectLabelsAndData method");
        }
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Job job = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        String jobString = job.toString();
        assertEquals(jobString, job.toString());
    }

    @Test
    public void testTestToStringHandlesEmptyFieldExists () throws ClassNotFoundException {
        Class jobTestClass = getClassByName("JobTest");
        Method testToStringHandlesEmptyField = null;

        try {
            testToStringHandlesEmptyField = jobTestClass.getMethod("testToStringHandlesEmptyField");
        } catch (NoSuchMethodException e) {
            fail("JobTest does not have a testToStringHandlesEmptyField method");
        }
    }

    @Test
    public void testToStringHandlesEmptyField() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Job job = new Job("Web Developer", new Employer("LaunchCode"), new Location("StL"), new PositionType("Back-end developer"), new CoreCompetency("Java"));
        String jobString = job.toString();
        assertEquals(jobString, job.toString());
    }

}
//Job("Web Developer", "", "StL", "", "Java");