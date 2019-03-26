package com.dbs.training.demoproj;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class TestCalculator {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		int result = c.add(5,5);
		assertEquals(10, result);
	}
	@Test
	public void testSub()
	{
		Calculator c = new Calculator();
		int result = c.subtract(15,5);
		assertEquals(10, result);
	}
}
