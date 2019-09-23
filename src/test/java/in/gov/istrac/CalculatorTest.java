package in.gov.istrac;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator CalculatorInstance = new Calculator();
		int Result = CalculatorInstance.add(5,5);
		assertEquals(10, Result);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testMutiply() {
		Calculator CalculatorInstance = new Calculator();
		int Result = CalculatorInstance.multiply(5,5);
		assertEquals(25, Result);
		//fail("Not yet implemented");
	}

}
