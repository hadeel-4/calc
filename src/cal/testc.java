package cal;



import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

class caltest {

	
		public void testSum_BothNumbersArePositive_ShouldReturnPositive() {
		// Arrange
		int a = 10;
		int b = -1*20;
		cal calc = new cal();
		// Act
		int result = calc.add(a, b);
		
		// Assert
		Assert.assertTrue(result > 0);
		}
	
		
		
		
		
		
	
	@Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {
		// Arrange
		int a = 10;
		int b = 1*20;
		cal calc = new cal();
		// Act
		int result = calc.add(a, b);
		
		// Assert
		Assert.assertTrue(result > 0);
		}
	
	

}
