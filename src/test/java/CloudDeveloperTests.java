import org.example.employees.CloudDeveloper;
import org.example.Website;
import org.example.employees.Developer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CloudDeveloperTests {

    CloudDeveloper cloudDeveloper;
    @BeforeEach
    public void init(){
        cloudDeveloper = new CloudDeveloper("Aws developer", "java");
    }

    @Test
    public void testFixWebsite(){
        var website = new Website(false);
        cloudDeveloper.FixWebsite(website);

        var expected = true;
        var actual = website.isWorkingStatus();

        assertEquals(expected, actual);
    }
}
