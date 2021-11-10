import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Melinda", 100, 500, "Codeclan", 1000);
    }

    @Test
    public void directorHasName(){
        assertEquals("Melinda", director.getName());
    }

    @Test
    public void directorHasNI(){
        assertEquals(100, director.getNI());
    }

    @Test
    public void directorHasSalary(){
        assertEquals(500, director.getSalary());
    }

    @Test
    public void directorHasDeptName(){
        assertEquals("Codeclan", director.getDeptName());
    }

    @Test
    public void directorHasBudget(){
        assertEquals(1000, director.getBudget(), 0.0);
    }

    @Test
    public void directorCanRaiseSalary(){
        assertEquals(600.0, director.raiseSalary(100), 0.0);
    }

    @Test
    public void directorPaysBonus(){
        assertEquals(5.0, director.payBonus(), 0.0);
    }

}
