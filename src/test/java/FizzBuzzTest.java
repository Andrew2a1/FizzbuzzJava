import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void FizzBuzzForOneIs1() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1", fizzbuzz.generateTo(1));
    }
}