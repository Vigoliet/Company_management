import org.example.Office;
import org.example.Utilities;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OfficeTests {

    @Test
    public void testGetMonthlyRent(){
        var office = new Office(14);

        var expected = 3908.33;
        var actual = office.getMonthlyRent();

        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(value={"14:3908.33", "42.7:10443.71", "20.9:5111.79", "38.7:9465.38"}, delimiter = ':')
    public void testGetMonthlyRent(double input, double expected){
        var office = new Office(input);
        var actual = office.getMonthlyRent();

        assertEquals(expected, actual);

    }

}
