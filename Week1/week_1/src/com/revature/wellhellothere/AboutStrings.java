package com.revature.wellhellothere;

public class AboutStrings {
	
	public static void maini(String[] args) {
	
	String a = "Well1";
	String b = "well2";
	String c = new String("Well3");
	String d = a;
	
	System.out.println("1 " + a.equals(c));
	System.out.println("2 " + (a==c));
	System.out.println("3 " + a.equals(d));
	System.out.println("4 " + (a==d));
	System.out.println("2 " + a.equalsIgnoreCase(b));
	// all referencing the stack heap for the same reference. 
	test(a);
	//a = test(a);
	System.out.println(a);
	
	}
	
	static void test(String x){
		x.substring(2);
	}
	
	
}
