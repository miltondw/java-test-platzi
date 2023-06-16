package vercel.miltondw.fizzBuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void fizz_divisible_3() {
        assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
    }
    @Test
    public void buzz_divisible_5() {
        assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
    }
    @Test
    public void fizzBuzz_divisible_3_and_5() {
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
    }
}