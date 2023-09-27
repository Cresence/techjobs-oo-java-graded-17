package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    Job testEntry;

    @BeforeEach
    public void setUpJobTest() {
        // Initializing the testing Job object for comparison:
        testEntry = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId () {
        Job testObj1 = new Job();
        Job testObj2 = new Job();
        assertNotEquals(testObj1, testObj2);
    }

    @Test
    public void testJobNameConstructorField() {
        setUpJobTest();

        // Individual Job Name Test:
        String testJobName = "Product tester";
        String msgTestName = "Test name will be same as returned string of getName() method from testEntry Job object";
        boolean actualTestName = testEntry.getName().equals(testJobName);
        assertTrue(msgTestName, actualTestName);
    }

    @Test
    public void testJobEmployerConstructorField() {
        setUpJobTest();

        // Individual Job Employer Test:
        String testJobEmploy = "ACME";
        String msgTestEmploy = "Test employer will be same as returned string of getEmployer() method from testEntry Job object";
        boolean actualTestEmploy = testEntry.getEmployer().toString().equals(testJobEmploy);
        assertTrue(msgTestEmploy, actualTestEmploy);
    }

    @Test
    public void testJobLocationConstructorField() {
        setUpJobTest();

        // Individual Job Location Test:
        String testJobLoc = "Desert";
        String msgTestLoc = "Test location will be same as returned string of getLocation() method from testEntry Job object";
        boolean actualTestLoc = testEntry.getLocation().toString().equals(testJobLoc);
        assertTrue(msgTestLoc, actualTestLoc);
    }

    @Test
    public void testJobPositionTypeConstructorField() {
        setUpJobTest();

        // Individual Job Position-Type Test:
        String testJobPos = "Quality control";
        String msgTestPos = "Test job-position will be same as returned string of getPositionType() method from testEntry Job object";
        boolean actualTestPos = testEntry.getPositionType().toString().equals(testJobPos);
        assertTrue(msgTestPos, actualTestPos);
    }

    @Test
    public void testJobCoreCompTypeConstructorField() {
        setUpJobTest();

        // Individual Job Core-Competency Test:
        String testJobCore = "Persistence";
        String msgTestCore = "Test core-comp will be same as returned string of getCoreCompetency() method from testEntry Job object";
        boolean actualTestCore = testEntry.getCoreCompetency().toString().equals(testJobCore);
        assertTrue(msgTestCore, actualTestCore);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        setUpJobTest();

        // Group Job Constructor Test:
        String testJobName = "Product tester";
        String testJobLoc = "Desert";
        String testJobEmploy = "ACME";
        String testJobPos = "Quality control";
        String testJobCore = "Persistence";

        assertEquals(testEntry.getName(), testJobName);
        assertEquals(testEntry.getEmployer().toString(), testJobEmploy);
        assertEquals(testEntry.getLocation().toString(), testJobLoc);
        assertEquals(testEntry.getPositionType().toString(), testJobPos);
        assertEquals(testEntry.getCoreCompetency().toString(), testJobCore);
    }

    @Test
    public void testJobsForEquality() {
        setUpJobTest();

        Job testEntryToo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(testEntry.getName(), testEntryToo.getName());
        assertEquals(testEntry.getName(), testEntryToo.getName());
        assertEquals(testEntry.getName(), testEntryToo.getName());
        assertEquals(testEntry.getName(), testEntryToo.getName());
        assertEquals(testEntry.getName(), testEntryToo.getName());
        boolean testActual = testEntry.getId() == testEntryToo.getId();
        assertFalse(testActual);

    }


}
