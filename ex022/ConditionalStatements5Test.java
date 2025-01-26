import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class ConditionalStatements5Test {

	@Test
	public void test() {
		assertEquals("abc", ConditionalStatements5.longestWord("a", "ab", "abc"));
		assertEquals("efg", ConditionalStatements5.longestWord("efg", "ef", "g"));
		assertEquals("hij", ConditionalStatements5.longestWord("hi", "hij", "h"));
		assertEquals("klm", ConditionalStatements5.longestWord("kl", "k", "klm"));
		assertEquals("nop", ConditionalStatements5.longestWord("nop", "n", "no"));
		assertEquals("qrs", ConditionalStatements5.longestWord("q", "qrs", "qr"));
	}

}
