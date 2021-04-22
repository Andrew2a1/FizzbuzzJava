import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void FizzBuzzForOneIs1() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1", fizzbuzz.generateTo(1));
    }

    @Test
    void FizzBuzzForTwoIs12() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1 2", fizzbuzz.generateTo(2));
    }

    @Test
    void FizzBuzzForThreeIs12Fizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1 2 Fizz", fizzbuzz.generateTo(3));
    }

    @Test
    void FizzBuzzForFiveIs12Fizz4Buzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1 2 Fizz 4 Buzz", fizzbuzz.generateTo(5));
    }

    @Test
    void FizzBuzzForFifteenHasFizzBuzz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz",
                fizzbuzz.generateTo(15));
    }
}