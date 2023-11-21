import org.example.Developer;
import org.example.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class DeveloperTests {

    @Test
    public void testGetSound(){
        var developer = new Developer("Linus", "Cobol");

        var expected = "Yay Java!";
        var actual = developer.getSound();

        assertEquals(expected, actual);
    }
}
