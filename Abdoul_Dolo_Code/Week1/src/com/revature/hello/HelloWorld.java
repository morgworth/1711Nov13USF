package com.revature.hello;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		//this is a comment
		
		
		//Below is a main method
		String name = "Abdoul Dolo";
		System.out.println(name);
		
		int x = 5;
		Integer ex = new Integer(5); // wrapper class 
		ex = x; // autoboxing
		
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		
		System.out.println("Hello " + text);
		
		int var[][] = new int[2][3];
		var[0][2] = 5;
		var[1][1] = 10;
		
		System.out.println(var[0][0]);
	}
	/*
	*comments
	*/
	
}