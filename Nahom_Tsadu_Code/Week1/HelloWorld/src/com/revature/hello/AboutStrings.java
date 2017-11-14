package com.revature.hello;

public class AboutStrings {
	public static void main(String[] args) {

		String b = "Hello";
		String f = "World!";
		
		System.out.println("WELCOME TO THE STRING CLASS");
		System.out.println("------------------------------------------------------------");
		System.out.println();
		System.out.println("String 1: " + b);
		System.out.println("String 2: " + f);
		System.out.println();
		System.out.println("Concatenating...");
		b = b.concat(" " + f);
		System.out.println();
		System.out.println(b);
		System.out.println();
		System.out.println("Doing something crazy...");
		System.out.println();
		
		doSomethingCrazy(b);
		
	}
	
	public static void doSomethingCrazy(String b){
		for(int i = 0; i < b.length(); i++){
			System.out.println(b.substring(i) 
					+ " " + b.substring(i) 
					+ " " + b.substring(i)
					+ " " + b.substring(i)
					+ " " + b.substring(i));
		}
		
		for(int i = b.length(); i >= 0; i--){
			System.out.println(b.substring(i) 
					+ " " + b.substring(i) 
					+ " " + b.substring(i)
					+ " " + b.substring(i)
					+ " " + b.substring(i));
		}
	}
	
	public static String test(String x){
		
		return x.substring(2);
	}
}
