package junitdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test_should_check_correctness_in_addition() {
		
		Calculator calculator = new Calculator();
		
		
		int seven = calculator.add(2,5);
		
		int five = calculator.add(2, 3);

		assertEquals("It should give proper result",7, seven);
		assertEquals("It should give proper result",5, five);
		
	}

	@Test
	public void test_should_check_power_algorithm() throws NegativeNumberException{
		
		Calculator calculator = new Calculator();

		int eight = calculator.power(2,3);
		int nine = calculator.power(3,2);

		int one = calculator.power(3, 0);
		
		assertEquals("2 to the power of 3 should return 8.",8, eight);
		assertEquals("3 to the power of 2 should return 9.",9, nine);
		assertEquals("3 to the power of 0 should return 1.",1, one);
	}

	@Test(expected = NegativeNumberException.class)
	public void test_should_check_if_power_operation_throws_exception_for_negative_power() throws NegativeNumberException{

		Calculator calculator = new Calculator();
		calculator.power(9, -1);
	}
	
}








