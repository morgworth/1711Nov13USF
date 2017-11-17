package com.revature.math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FooBarNoMod {

	
	
	/*
	 *  Write a program to determine if 
	 *  an integer is even without
	 *  using the modulus operator (%) , 
	 *  and write a jUnit test case
	 * 
	 * 
	 */
	
	
	
	
	
	public static void main(String[] args) {
		
		int userInput = getData();
		String result = testData(userInput);
		System.out.println("Your value is: " + result);
		
		
	}
	
	
	
	// get a users input 
	
	public static int getData() {
		
		//Scanner scan = new Scanner(System.in);
		// AutoClosable is implemented by the Scanner class when it is 
		// instantiated. 
		// Only classes that implement AutoClosable can be used
		// with try-with-resources
		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Please enter an interger: ");
			int input = scan.nextInt();
			return input;
			
			
		}catch(InputMismatchException ime ){
			System.out.println("The value was invalid, please try again.");
			int newTry = getData();
			return newTry;
			
		}catch(Exception e) {
			System.out.println(" Error occured. ");
			e.printStackTrace();
			int newTry = getData();
			return newTry;
		}
		
//		finally {
//			scan.close();
//		}
		
	}
	
	// Step two determines if a given value is even or odd
	
	
	public static String testData(int input) {
		
		String result;
		
		if( (input /2 )*2 == input) {
			
			result = "Even";
			
		}else {
			result = "Odd";
		}
		return result;
	}
	
	
	
	
	
	
	
}
