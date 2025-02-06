import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class Loops6Test {

	@Test
	public void test() {
		assertEquals(15, Loops6.investmentCalculator(1000, 5, 2000));
		assertEquals(70, Loops6.investmentCalculator(1, 1, 2));
		assertEquals(13, Loops6.investmentCalculator(11.11, 5.5, 22.22));
		assertEquals(0, Loops6.investmentCalculator(1000, 5, 1000));
		assertEquals(0, Loops6.investmentCalculator(1000, 5, 500));		
	}

    @Test
    public void testInvalidInputs() {

    	boolean arithmeticExceptionThrown = false;
    	try {
    		Loops6.investmentCalculator(1000, 0, 2000);
            fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
        	arithmeticExceptionThrown = true;
        }
        assertEquals(true, arithmeticExceptionThrown);
        
        arithmeticExceptionThrown = false;
        try {
        	Loops6.investmentCalculator(0, 5, 2000);
        	fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
        	arithmeticExceptionThrown = true;
        }
        
        boolean illegalArgumentExceptionThrown = false;
        try {
        	Loops6.investmentCalculator(-1000, 5, 2000);
        	fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
        	illegalArgumentExceptionThrown = true;
        }
        assertEquals(true, illegalArgumentExceptionThrown);

        
        illegalArgumentExceptionThrown = false;
        try {
        	Loops6.investmentCalculator(1000, -5, 2000);
        	fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
        	illegalArgumentExceptionThrown = true;
        }
        assertEquals(true, illegalArgumentExceptionThrown);
        
        illegalArgumentExceptionThrown = false;
        try {
        	Loops6.investmentCalculator(1000, 5, -2000);
        	fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
        	illegalArgumentExceptionThrown = true;
        }
        assertEquals(true, illegalArgumentExceptionThrown);
        
        
    }
}
