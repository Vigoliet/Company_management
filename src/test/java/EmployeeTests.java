import org.example.employees.Developer;
import org.example.employees.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmployeeTests {

    Employee employee;
    @BeforeEach
    public void init(){
        employee = new Employee("Linus");
    }

    @Test
    public void testConstructorSetName(){
        var expected = "Linus";
        var actual = employee.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetSound(){
        var expected = "Are we done yet?";
        var actual = employee.getSound();

        assertEquals(expected, actual);
    }

    @Test
    public void testEatFood(){
        var expected = "Nom nom nom!";
        var actual = employee.eatFood();

        assertEquals(expected, actual);
    }

}
