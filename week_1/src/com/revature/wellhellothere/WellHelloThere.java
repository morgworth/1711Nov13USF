package com.revature.wellhellothere;

import java.util.Scanner;

public class WellHelloThere {

	// This is a main method
	public static void main(String[] args) {
	String name = "William Rhodes";
	System.out.println("Well Hello There " + name + "!");
	
	/*
	 * Block comment here
	 */
	
	/*int x = 5;
	Integer ex = new Integer(5); // wrapper class
	ex = x;
	*/
	Scanner userinfo = new Scanner(System.in);
	String text = userinfo.nextLine();
	
	System.out.println("Well Hello There " + text);
	
	
	}
}

