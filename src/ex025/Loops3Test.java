package ex025;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Loops3Test {

	@Test
	public void test() {
		assertEquals("eo", Loops3.stripConsonants("hello"));
		assertEquals("iiiiiiy", Loops3.stripConsonants("indivisibility"));
		assertEquals("euiooeueoeeayo", Loops3.stripConsonants("the quick brown foxes jumped over the lazy dogs"));
	}

}
