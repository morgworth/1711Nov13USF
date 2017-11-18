package com.rev.run;

import java.util.Scanner;

public class RunBank {
	static Service service = new Service();

	public static void main(String[] args) {
		
		run();
		
	}
		
		
		
	static void run() {	
		System.out.println("Welcome to BondsBank\n Would you like " 
				+ " to login(1) or Create account(2)");
		
		Scanner scan = new Scanner(System.in);
		String op = scan.nextLine();
		switch(op){
		case "1":
		case "2": 
		default: run():
				
		}

	}

	
	static User login() {
		return null;
		
	}
	
	static User  createAccount() {
		System.out.println(" Wellcome , please enter you name: ");
		User u = new User();
		u.setFirstName("Will");
		u.setLastName("Rhodes");
		u.setUsername("username");
		u.setPassword("password");
		u.setBallance(100000.00);
		
	
		return null;
	}
	
	
	
}
