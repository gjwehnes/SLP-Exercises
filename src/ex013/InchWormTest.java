package ex013;

import static org.junit.Assert.*;

import org.junit.Test;

public class InchWormTest {

	@Test
	public void testName() {
	// Failure message: 
	// This test has no failure messages
	        //default constructor
	        InchWorm worm1 = new InchWorm();
	        assertEquals(0, worm1.getPosition());
	        worm1.move();
	        worm1.move();
	        worm1.turn();
	        worm1.move();
	        assertEquals(1, worm1.getPosition());
	        
	        //default constructor
	        InchWorm worm2 = new InchWorm(10);
	        worm2.move();
	        worm2.move();
	        worm2.move();
	        worm2.move();
	        assertEquals(14, worm2.getPosition());
	        worm2.turn();
	        worm2.move();
	        worm2.move();
	        worm2.turn();
	        worm2.move();
	        assertEquals(13, worm2.getPosition());
	}
	}
