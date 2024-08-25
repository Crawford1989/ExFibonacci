import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FibonacciTest {

    @Test
    public void math() {
        assertEquals(0, Fibonacci.Math(0));
        assertEquals(1, Fibonacci.Math(1));
        assertEquals(1, Fibonacci.Math(2));
        assertEquals(2, Fibonacci.Math(3));
        assertEquals(3, Fibonacci.Math(4));
        assertEquals(5, Fibonacci.Math(5));
        assertEquals(8, Fibonacci.Math(6));
        assertEquals(13, Fibonacci.Math(7));
        assertEquals(21, Fibonacci.Math(8));
        assertEquals(34, Fibonacci.Math(9));
        assertEquals(55, Fibonacci.Math(10));
    }
}