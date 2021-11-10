import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Stan", 010, 121);
    }

    @Test
    public void developerHasName(){
        assertEquals("Stan", developer.getName());
    }

    @Test
    public void developerHasNI(){
        assertEquals(010, developer.getNI());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(121, developer.getSalary());
    }


    @Test
    public void developerCanRaiseSalary(){
        assertEquals(221.0, developer.raiseSalary(100), 0.0);
    }

    @Test
    public void developerPaysBonus(){
        assertEquals(1.0, developer.payBonus(), 0.21);
    }

}
