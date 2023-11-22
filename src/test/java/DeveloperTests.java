import org.example.employees.Developer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeveloperTests {

    Developer developer;
    @BeforeEach
    public void init(){
        developer = new Developer("Linus", "java");
    }

    @Test
    public void testGetSound() {

        var expected = "Yay Java!";
        var actual = developer.getSound(); // This one is hard coded

        assertEquals(expected, actual);
    }

    @Test
    public void testGetProgrammingLanguage() {

        var expected = "java";
        var actual = developer.getProgrammingLanguage();

        assertEquals(expected, actual);

    }

    @Test
    public void testProgram() {
        var expected = "Linus writes some java";
        var actual = developer.program();

        assertEquals(expected, actual);

    }

}
