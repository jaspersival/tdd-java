import alliander.jsival.FizzBuzzer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFizzBuzz {
    @Test
    void testShouldReturnStringGivenNumber() {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();
        String result = fizzBuzzer.fizzBuzz(1);
        assertEquals("1", result);
    }
}