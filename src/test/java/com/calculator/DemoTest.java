package com.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	void testAdd() {
		Demo d1=new Demo();
		int actual=d1.add(5, 5);
		int expected=0;
		
		assertEquals(expected,actual,"addition od test cases");
	}

}
