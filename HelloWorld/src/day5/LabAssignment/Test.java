package day5.LabAssignment;

import static org.junit.Assert.*;

import java.util.Scanner;

public class Test {

	@org.junit.Test
	public void test() {
		Problem p = new Problem();
		//p.Problem2();
		p.Problem1(p.b);
		p.Problem2();
		p.Problem3("tnert");
		System.out.println("Problem 4");
		System.out.println(p.Problem4(4));
		System.out.println("Problem 5");
		p.Problem5("good job", 5);
		System.out.println("\n");
		p.Problem6(4);
/*		System.out.println("Problem 8");
		p.Problem8();*/
		System.out.println("Problem 9");
		System.out.println(p.Problem9());
		System.out.println("Problem 10");
		System.out.println(p.Problem10(5, 7));
		System.out.println("Problem 14");
		p.Problem14(1,4 );
		p.Problem14(2,4 );
		p.Problem14(3,4 );
		System.out.println("Problem 20");
		p.P20readPeople();
		
	}
}
