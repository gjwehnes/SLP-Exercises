import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class Loops3Test {

	@Test
	public void test() {
		assertEquals("eo", Loops3.stripConsonants("hello"));
		assertEquals("iiiiiiy", Loops3.stripConsonants("indivisibility"));
		assertEquals("euiooeueoeeayo", Loops3.stripConsonants("the quick brown foxes jumped over the lazy dogs"));
	}

}
