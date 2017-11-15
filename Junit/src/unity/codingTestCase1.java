package unity;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class codingTestCase1 {
	CodeChallenges c;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	System.out.println("BEfore Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	System.out.println("AFter class");
	}

	@Before
	public void setUp() throws Exception {
	c = new CodeChallenges();
	}

	@After
	public void tearDown() throws Exception {
	c =null;
		System.out.println("after method");
	}

	@Test
	public void testFactorial() {
		System.out.println("in test factorial method");
		int expected =120;
		int actual = c.factorial(5);
		assertEquals(expected,actual);
		assertNotEquals(0,actual);
	}
	@Test
	public void testFactorialZero()
	{
		assertNotEquals(0,c.factorial(5));
		System.out.println("will fail");
		assertNotEquals(1,c.factorial(5));
		System.out.println("has failed");
		c.s1("trent");
		
	}
	@Test
	public void teststring()
	{
		assertNotEquals(1,c.factorial(5));
		c.s1("trent");
	}
	

}
