package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    private Job j1,j2,j3,j4,j5,j6,j7,j8;



    @Before
    public void createObj(){
        j1=new Job();
        j2=new Job();
            }


     @Test
    public void testSettingJobId(){
   assertEquals(j1.getId(),j2.getId(),1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        j3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", j3.getName());
        assertTrue(j3.getEmployer().getValue()=="ACME");
        assertFalse(j3.getLocation().getValue()!="Desert");
        assertEquals("Quality control", j3.getPositionType().getValue());
        assertEquals("Persistence", j3.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality(){
         j4= new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
         j5= new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        assertFalse(j4.getId()== j5.getId());
    }
    @Test
public void testToString(){
        j6= new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
        assertTrue(j6.toString().startsWith(""));
        assertTrue(j6.toString().endsWith(""));
    }
    @Test
    public void testToStringline(){
    j7=new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
            assertTrue(j7.toString().startsWith("\n"));
            assertTrue(j7.toString().endsWith("\n"));
    }
    @Test
    public void testToStringEmpty(){
     j8=new Job("Ice cream taster", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
        assertNotNull("Data not available",j8.getEmployer().getValue()=="");
    }
}
