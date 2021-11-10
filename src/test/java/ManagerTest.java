import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Steve", 333, 444, "Codeclan");
    }

    @Test
    public void managerHasName(){
        assertEquals("Steve", manager.getName());
    }

    @Test
    public void managerHasNI(){
        assertEquals(333, manager.getNI());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(444, manager.getSalary());
    }

    @Test
    public void managerHasDeptName(){
        assertEquals("Codeclan", manager.getDeptName());
    }

    @Test
    public void managerCanRaiseSalary(){
        assertEquals(544.0, manager.raiseSalary(100), 0.0);
    }

    @Test
    public void managerPaysBonus(){
        assertEquals(4.0, manager.payBonus(), 0.44);
    }


}
