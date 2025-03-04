/**
 * --------------------------------------------------------------
 * SimpleCalculatorTest.java
 * Edited By: Sadé Jn Baptiste
 * Course: COSC 603
 * Date: March 4, 2025
 * Description: This file implements tests for SimpleCalculator.java
 * --------------------------------------------------------------
 */

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
	public void testSubtract() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(10, 4), 6);
	}

	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(25, 4), 100);
	}

	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(6, 2), 3);
	}

	@Test
	public void testDivideByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		assertThrows(ArithmeticException.class, () -> calc.divideZero(10, 0));
	}

	@Test
	public void testNegativeValues(){
		SimpleCalculator calc= new SimpleCalculator();
		assertEquals(calc.add(-8,-6),-14);
		assertEquals(calc.subtract(-10, -7),-3);
		assertEquals (calc.multiply( -7 , -4),28);
		assertEquals (calc.divide(-10, -5),2);
	}

	@Test
	public void testIndicies(){
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.indices(5,3),125);
	}
}
