import org.junit.*;
import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class DividerTest {

    // generated with github copilot

    @Test
    public void testPositiveNumbers() {
        assertEquals(2.0, Divider.divide(4, 2), 0.01);
        assertEquals(2.5, Divider.divide(5, 2), 0.01);
    }

    @Test
    public void testNegativeNumbers() {
        assertEquals(-2.0, Divider.divide(-4, 2), 0.01);
        assertEquals(-2.5, Divider.divide(-5, 2), 0.01);
        assertEquals(2.0, Divider.divide(-4, -2), 0.01);
    }

    @Test
    public void testZeroNumerator() {
        assertEquals(0.0, Divider.divide(0, 2), 0.01);
    }

    @Test
    public void testZeroDenominator() {
        try {
            Divider.divide(4, 0);
            fail("Expected an ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            assertEquals("division by zero", e.getMessage());
        }
    }

    @Test
    public void testDecimalResult() {
        assertEquals(0.333, Divider.divide(1, 3), 0.01);
    }

    @Test
    public void testNegativeDenominator() {
        assertEquals(-2.0, Divider.divide(4, -2), 0.01);
        assertEquals(-2.5, Divider.divide(5, -2), 0.01);
    }
    
    public void testParameterTypes() {
        try {
            Method method = Divider.class.getMethod("divide", int.class, int.class);
            Parameter[] parameters = method.getParameters();
            assertEquals(2, parameters.length);
            assertEquals(int.class, parameters[0].getType());
            assertEquals(int.class, parameters[1].getType());
        } catch (NoSuchMethodException e) {
            fail("Method 'divide' with two int parameters does not exist");
        }
    }

}