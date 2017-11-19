package com.rev.run;

import java.util.Scanner;

import com.rev.pojos.User;
import com.rev.service.Service;


public class RunBank {
	static Service service = new Service();

	public static void main(String[] args) {
		
		run();
		
	}
		
		
		
	static void run() {	
		System.out.println("Welcome to BondsBank\n Would you like " 
				+ " to login(1) or Create account(2) or close(3):");
		
		Scanner scan = new Scanner(System.in);
		String op = scan.nextLine();
		switch(op){
		case "1": 
		case "2": createAccount(); break;
		//case "3": 
		default: run();
				
		}

	}

	
	static User login() {
		return null;
		
	}
	
	static User createAccount() {
		// try (){
		System.out.println(" Wellcome , please enter you name: ");
		User u = new User();
		Scanner scan1 = new Scanner(System.in);
		
		System.out.println("first name: ");
		scan1.nextLine();
		System.out.println("last name: ");
		u.getLastname();
		System.out.println("Username: ");
		u.getUsername();
		System.out.println("Your password: ");
		u.getPassword();
		System.out.println("Please enter a deposit: ");
		u.getBalance();
		/*}catch(u = null){
			
			u.setFirstname("Will");
			u.setLastname("Rhodes");
			u.setUsername("RoadWarrior");
			u.setPassword("SuperSecretPassword1!");
			u.setBalance(1000.00);
			// deposit $$
		
			*/
			service.addUser(u);
			return u;
		}
		
		
	
	}
	
	
	

