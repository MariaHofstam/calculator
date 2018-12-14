package lexicon.se.maria.calculator;

import org.junit.Assert;
import org.junit.Test;



public class CalculatorTest {
	@Test
	
	public void test_calculate_add_numbers_return_expected () {
		//Setting up
		double number1 = 1;
		double number2 = 5;
		String operator = "+";
		
		//Expected result
		double expected = 6.0;
		
		//Actual value
		double actual = App.calculate (number1, number2, operator);
		
		Assert.assertEquals(expected, actual, 0.1);
	}


	@Test
	public void test_division_by_zero_return_zero () {
	double expected = 0;
	
	Assert.assertEquals(expected, App.calculate (10, 0, "/"), 0.1);
	}
}
