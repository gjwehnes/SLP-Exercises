package ex005;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test005 {

	@Test
	public void tests() {
		// Failure message: 
		// If the unit test does not compile, check if you've created all variables and that they are named correctly. If the unit test compiles but does not pass, check if you've set the default values correctly!
		Main a = new Main();
		assertEquals(a.active,true);
		assertEquals(a.name,"Nemo");
		assertEquals(a.grade,11);
	}
}
