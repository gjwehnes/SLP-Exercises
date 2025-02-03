import org.junit.*;
import static org.junit.Assert.*;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Loops2Test {

    // generated with github copilot

    @Test
    public void test() {
        assertEquals("(1)(2)(3)(4)", Loops2.getRange(1, 5, 1));
        assertEquals("(3)(4)(5)(6)(7)", Loops2.getRange(3, 8, 1));
        assertEquals("(1)(3)(5)(7)(9)", Loops2.getRange(1, 10, 2));
        assertEquals("(2)(4)(6)(8)", Loops2.getRange(2, 10, 2));
    }

    @Test
    public void testInvalidInputs() {
        assertEquals("", Loops2.getRange(1, 5, 0)); // step is zero
        assertEquals("", Loops2.getRange(1, 5, -2)); // start is greater than end with positive step
    }

    @Test
    public void testSingleElementRange() {
        assertEquals("(1)", Loops2.getRange(1, 2, 1));
        assertEquals("(5)", Loops2.getRange(5, 6, 1));
    }

}