package test;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testSumMethod() throws Exception {
	double a = 4.00;
	double b = 7.00;
	
	double result = classUnderTest.sum(a, b);
	
	assertEquals(11.0, result, 0.001);
	}
	

	@Test
	public void testSubstractMethod() throws Exception {
		double a = 8.00;
		double b = 7.00;
		
		double result = classUnderTest.subtract(a, b);
		
		assertEquals(1.00, result, 0.001);
		
		}
	
	@Test
	public void testMultiplyMethod() throws Exception {
		double a = 2.0;
		double b = 7.0;
		
		double result = classUnderTest.multiply(a, b);
		
		assertEquals(14.0, result, 0.001);
	}
	
	
	@Test
	public void testDivideMethod2() throws Exception {
		double a = 21.0;
		double b = 7.0;
		
		double result = classUnderTest.divide(a, b);
		
		assertEquals(21.0/7.0, result, 0.001);
		assertFalse (b == 0);
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivideMethod() throws Exception {
		double a = 5.0;
		double b = 0.0;
		
		classUnderTest.divide(a, b);
	}
	
	
}
	
	
	


