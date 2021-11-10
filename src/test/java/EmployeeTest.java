import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Test
    public void employeeAsStaff(){
        employee = new Manager("Jen", 1111, 222, "Codeclan");
        assertEquals("Jen", employee.getName());
    }


}
