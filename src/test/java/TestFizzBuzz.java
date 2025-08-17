import alliander.jsival.FizzBuzzer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzz {
    private FizzBuzzer fizzBuzzer;

    @BeforeEach
    void setUp() {
        fizzBuzzer = new FizzBuzzer();
    }

    @Test
    void testShouldReturnStringGivenNumber() {
        String result = fizzBuzzer.fizzBuzz(1);
        assertEquals("1", result);
    }
    @Test
    void testShouldReturnFizzGivenMultipleOfThree() {
        String result = fizzBuzzer.fizzBuzz(3);
        assertEquals("Fizz", result);
    }
}