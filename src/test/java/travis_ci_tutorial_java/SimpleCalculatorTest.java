package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}

	@Test
	public void testSubtract(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(10,4),6);
	}

	@Test
	public void testMultiply(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(25,4),100);
	}
}

