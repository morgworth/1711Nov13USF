package com.ex.probs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CodingChallengesTest {
	CodingChallenges c; //dec 
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	System.out.println("after class");
	}

	@Before
	public void setUp() throws Exception {
		 c = new CodingChallenges();
		System.out.println("befoe method ");
	}

	@After
	public void tearDown() throws Exception {
		c=null;
		System.out.println("after method");
	}

	@Test 
	public void testFactorial() {
		//fail("Not yet implemented");
		System.out.println("in test factorial method");
		int expected =120;
		int actual = c.factorial(5);
		assertEquals(expected, actual);

		
	}
	@Test
	public void testFactorialZero(){
		System.out.println("in test not zero method");
		assertNotEquals(1,  c.factorial(5));
		System.out.println("will fail");
		assertNotEquals(120,  c.factorial(5));
		System.out.println("has fail");
		//exits on first fails. 
	}
}