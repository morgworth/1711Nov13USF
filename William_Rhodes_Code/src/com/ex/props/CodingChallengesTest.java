package com.ex.props;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CodingChallengesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void testFactorial() {
		System.out.println("in test factorial method");
		int expected =120;
		int actual = c.factorial(5);
		assertEquals(expected, actual);
	}
	@Test
	public void testFactorialZero() {
		System.out.println("intest not zero method");
		assertNotEquals(0, c.factorial(5));
		System.out.println("Will fail");
		
		System.out.println("Has failed");
	}

}
