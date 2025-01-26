import org.junit.*;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class ConditionalStatements3Test {

	@Test
	public void test() {
		assertEquals("dog", ConditionalStatements3.getAnimal(new String("husky")));
		assertEquals("dog", ConditionalStatements3.getAnimal(new String("shepherd")));
		assertEquals("dog", ConditionalStatements3.getAnimal(new String("beagle")));
		assertEquals("cat", ConditionalStatements3.getAnimal(new String("siamese")));
		assertEquals("cat", ConditionalStatements3.getAnimal(new String("persian")));
		assertEquals("cat", ConditionalStatements3.getAnimal(new String("sphynx")));
		assertEquals("other", ConditionalStatements3.getAnimal(new String("clydesdale")));
	}

}
