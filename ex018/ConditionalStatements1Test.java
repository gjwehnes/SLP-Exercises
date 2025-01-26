import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class ConditionalStatements1Test {

	@Test
	public void test() {
		assertEquals("odd", ConditionalStatements1.isNumberEven(13));
		assertEquals("even", ConditionalStatements1.isNumberEven(16));
		assertEquals("even", ConditionalStatements1.isNumberEven(42));
		assertEquals("odd", ConditionalStatements1.isNumberEven(99));
		assertEquals("odd", ConditionalStatements1.isNumberEven(-3));
		assertEquals("even", ConditionalStatements1.isNumberEven(-6));
		assertEquals("even", ConditionalStatements1.isNumberEven(0));
	}

}
