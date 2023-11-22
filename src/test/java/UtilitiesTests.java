import org.example.Level;
import org.example.Utilities;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class UtilitiesTests {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, -5})
    public void testNumberIsOddTrue(int number){
        var expected = true;
        var actual = Utilities.isOdd(number);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 10, -10, -4, -2})
    public void testNumberIsOddFalse(int number){
        var expected = false;
        var actual = Utilities.isOdd(number);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @ValueSource(strings = {"", "    ", ""})
    @NullAndEmptySource
    public void testStringIsBlankTrue(String input){
        var expected = true;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @ValueSource(strings = {"Caitlyn", " Faker  Showmaker ", "ADC "})
    public void testStringIsBlankFalse(String input){
        var expected = false;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected, actual);

    }


    @ParameterizedTest
    @NullAndEmptySource
    public void testStringIsBlankNull(String input){
        var expected = true;
        var actual = Utilities.stringIsBlank(input);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @ValueSource(ints = {5, 15, 25, 30})
    public void testGetNoiseLevelLow(int decibel){
        var expected = Level.LOW;
        var actual = Utilities.getNoiseLevel(decibel);

        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @ValueSource(ints = {35, 40, 45, 50})
    public void testGetNoiseLevelMedium(int decibel){
        var expected = Level.MEDIUM;
        var actual = Utilities.getNoiseLevel(decibel);

        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @ValueSource(ints = {70, 71, 72, 73})
    public void testGetNoiseLevelHigh(int decibel){
        var expected = Level.HIGH;
        var actual = Utilities.getNoiseLevel(decibel);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value={"tEsT:test", "TEST:test", "TEst:test", "tEsT:test"}, delimiter = ':')
    public void testMakeStringLowercase(String input, String expected){
        var actual = Utilities.makeStringLowerCase(input);

        assertEquals(expected, actual);

    }
}
