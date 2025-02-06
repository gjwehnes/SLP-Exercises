import org.junit.*;
import static org.junit.Assert.*;

public class Loops5Test {

    // generated with github copilot

    @Test
    public void test() {
        assertEquals(5, Loops5.getTimesDivisible(32, 2));
        assertEquals(4, Loops5.getTimesDivisible(31, 2));
        assertEquals(5, Loops5.getTimesDivisible(33, 2));
        assertEquals(10, Loops5.getTimesDivisible(1024, 2));
        assertEquals(4, Loops5.getTimesDivisible(81, 3));
    }

    @Test
    public void testLargeNumbers() {
        assertEquals(20, Loops5.getTimesDivisible(1048576, 2)); // 2^20
        assertEquals(10, Loops5.getTimesDivisible(59049, 3)); // 3^10
    }

    @Test
    public void testEdgeCases() {
        assertEquals(0, Loops5.getTimesDivisible(1, 2)); // 1 is not divisible by 2
        assertEquals(0, Loops5.getTimesDivisible(0, 2)); // 0 is not divisible by any number
    }

    @Test
    public void testInvalidInputs() {

    	boolean arithmeticExceptionThrown = false;
    	try {
            Loops5.getTimesDivisible(10, 0);
            fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
        	arithmeticExceptionThrown = true;
        }
        assertEquals(true, arithmeticExceptionThrown);
        
        arithmeticExceptionThrown = false;
        try {
        	Loops5.getTimesDivisible(10, 1);
        	fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
        	arithmeticExceptionThrown = true;
        }
        assertEquals(true, arithmeticExceptionThrown);

        boolean illegalArgumentExceptionThrown = false;
        try {
        	Loops5.getTimesDivisible(10, -2);
        	fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
        	illegalArgumentExceptionThrown = true;
        }
        assertEquals(true, illegalArgumentExceptionThrown);

        illegalArgumentExceptionThrown = false;
        try {
        	Loops5.getTimesDivisible(-10, 2);
        	fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
        	illegalArgumentExceptionThrown = true;
        }
        assertEquals(true, illegalArgumentExceptionThrown);
        
    }

}