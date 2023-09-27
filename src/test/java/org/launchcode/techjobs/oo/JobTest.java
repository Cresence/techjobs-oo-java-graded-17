package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test
    public void testSettingJobId () {
        Job testObj1 = new Job();
        Job testObj2 = new Job();
        assertNotEquals(testObj1, testObj2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job testEntry = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Job Name Test:
        String testJobName = "Product tester";
        String msgTestName = "Test name will be same as returned string of getName() method from testEntry Job object";
        boolean actualTestName = testEntry.getName().equals(testJobName);
        assertTrue(msgTestName, actualTestName);

        // Job Employer Test:
        String testJobEmploy = "ACME";
        String msgTestEmploy = "Test employer will be same as returned string of getEmployer() method from testEntry Job object";
        boolean actualTestEmploy = testEntry.getEmployer().toString().equals(testJobEmploy);
        assertTrue(msgTestEmploy, actualTestEmploy);

        // Job Location Test:
        String testJobLoc = "Desert";
        String msgTestLoc = "Test location will be same as returned string of getLocation() method from testEntry Job object";
        boolean actualTestLoc = testEntry.getLocation().toString().equals(testJobLoc);
        assertTrue(msgTestEmploy, actualTestLoc);

        // Job Position-Type Test:
        String testJobPos = "Persistence";
        String msgTestPos = "Test job-position will be same as returned string of getPositionType() method from testEntry Job object";
        boolean actualTestPos = testEntry.getPositionType().getValue().equals(testJobPos);
        assertTrue(msgTestPos, actualTestPos);

        // Job Core-Competency Test:
        String testJobCore = "Persistence";
        String msgTestCore = "Test core-comp will be same as returned string of getCoreCompetency() method from testEntry Job object";
        boolean actualTestCore = testEntry.getCoreCompetency().toString().equals(testJobCore);
    }
}
