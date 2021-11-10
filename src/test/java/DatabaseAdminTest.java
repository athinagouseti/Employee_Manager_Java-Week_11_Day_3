import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseadmin;

    @Before
    public void before(){
        databaseadmin = new DatabaseAdmin("Pete", 100, 200);
    }

    @Test
    public void databaseadminHasName(){
        assertEquals("Pete", databaseadmin.getName());
    }

    @Test
    public void databaseadminHasNI(){
        assertEquals(100, databaseadmin.getNI());
    }

    @Test
    public void databaseadminHasSalary(){
        assertEquals(200, databaseadmin.getSalary());
    }


    @Test
    public void databaseadminCanRaiseSalary(){
        assertEquals(300, databaseadmin.raiseSalary(100), 0.0);
    }

    @Test
    public void databaseadminPaysBonus(){
        assertEquals(2.0, databaseadmin.payBonus(), 0.0);
    }
}
