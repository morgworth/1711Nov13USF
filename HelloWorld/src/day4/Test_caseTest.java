package day4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test_caseTest 
{
	Assignments e;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	//System.out.println("BEfore Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	//System.out.println("AFter class");
	}
	@Before
	public void setUp() throws Exception {
	e = new Assignments();
	}

	@After
	public void tearDown() throws Exception {
	e =null;
		//System.out.println("after method");
	}

	@Test
	public void test() {
		System.out.println(e.test(12));
		System.out.println(e.a());
		//ArrayList<Integer>e.a();
		System.out.println(e.minm(5, 7));
		e.Switching(1, 4);
		e.Switching(2, 4);
		e.Switching(3, 4);
		People m = new People("Mickey Mouse",50,"Arizona");
		People h = new People("Hulk Hogan",50,"Virgina");
		People r = new People("Roger Rabbit",22,"Califonia");
		People w = new People("Wonder Woman",18,"Montana");
		/*e.WritetoFile(m);
		e.WritetoFile(h);
		e.WritetoFile(r);
		e.WritetoFile(w);*/
		e.readPeople();
	}

}
