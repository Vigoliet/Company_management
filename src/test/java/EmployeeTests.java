import org.example.employees.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EmployeeTests {

    @Test
    public void testConstructorSetName(){
        var employee = new Employee("linus");

        var expected = "Linus";
        var actual = employee.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetSound(){
        var employee = new Employee("Linus");

        var expected = "Are we done yet?";
        var actual = employee.getSound();

        assertEquals(expected, actual);
    }

    @Test
    public void testEatFood(){
        var employee = new Employee("Linus");

        var expected = "Nom nom nom!";
        var actual = employee.eatFood();

        assertEquals(expected, actual);
    }

}
