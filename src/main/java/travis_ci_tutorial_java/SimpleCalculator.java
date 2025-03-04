/**
 * --------------------------------------------------------------
 * SimpleCalculatorTest.java
 * Edited By: Sadé Jn Baptiste
 * Course: COSC 603
 * Date: March 4, 2025
 * Description: This file implements a simple calculator with add, subtract,
 *  multiply, divide, and error handling for division by zero.
 * --------------------------------------------------------------
 */
package travis_ci_tutorial_java;

public class SimpleCalculator {
	public int add(int a, int b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public void divideZero(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
	}

	public int indices( int a, int b){
	return a^b;
	}

}