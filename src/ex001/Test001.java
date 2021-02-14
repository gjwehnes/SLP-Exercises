package ex001;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Method;//EditDelete
import java.lang.reflect.Modifier;//EditDelete
import java.util.ArrayList;//EditDelete
import java.util.List;//

import org.junit.Test;

public class Test001 {

	@Test
	public void test() {
		Main a = new Main();
		assertEquals(2,a.practiceOne());
	}
	
	
	@Test
	public void testIfNonStatic() {
	// Failure message: 
	//  Method should be non-static but is declared as static.
		    List<Method> methods = new ArrayList<Method>();
		    for (Method method : Main.class.getMethods()) {
		    	if (method.getName().equals("practiceOne")){
		    		assertEquals(false, Modifier.isStatic(method.getModifiers()));
		    	}
		    }
	}
	}