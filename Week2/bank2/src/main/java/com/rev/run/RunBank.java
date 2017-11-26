package com.rev.run;

import java.util.Scanner;

import com.rev.pojos.User;
import com.rev.service.Service;



/*
 * 
 * This is the bank program with added functionality to add remove and check the 
 * balance of the bank account of the user once the user has been validated
 * as existing and passed through using a password. 
 *
 * 
 * 
 * 
 * 
 */




public class RunBank {
	static Service service = new Service();

	public static void main(String[] args) {

		if (run() == true ) {
			run2();
		}
		Scanner scan = new Scanner(System.in);
		
		
		scan.close();
		
		
	}



	static boolean run() {	
		System.out.println("Welcome to Rhodes Accounts please\n " 
				+ " to login(1) or Create account(2) or close(3)\n>:");

		Scanner runscan = new Scanner(System.in);
		String checkuser2 = runscan.nextLine();
		switch(checkuser2){
		case "1": login(); return false;
		//break;
		case "2": createAccount(); return true; //run();
		//break;
		case "3": System.out.println("Goodbye.");
		break;
		default: run();
		break;

		}
		return false;
	}

	static boolean run2() {	
		System.out.println("Welcome to Rhodes Accounts please\n " 
				+ " to login(1) or close(3)\n>:");

		Scanner runscan2 = new Scanner(System.in);
		String checkuser2 = runscan2.nextLine();
		switch(checkuser2){
		case "1": login(); 
		break;
		//case "2": createAccount(); return true; //run();
		//break;
		case "2": System.out.println("Goodbye.");
		break;
		default: run();
		break;

		}
		runscan2.close();
		return false;
	}
	
	
	
	static User login() {



		Scanner login2 = new Scanner(System.in);
		String checkuser2;
		User u = new User();

		System.out.println(" Please enter your username: ");

		System.out.println("Username: ");
		checkuser2 = login2.nextLine();
		u.setUsername(checkuser2);

		if(service.existsUser(u) == false){
			System.out.println("This username is not available.");
			return u;       
		}

		u = service.getUser(u);
		System.out.println("Your password: ");
		checkuser2 = login2.nextLine();
		System.out.println("Password is " + u.getPassword());
		System.out.println("check password is: " + checkuser2);

		if(u.getPassword().equals(checkuser2) == false) {
			return u;

		}


		do {

			System.out.println("Deposit MoMoney (1), Withdraw (2), Current Balance (3), Exit (4)" + "\n>: ");
			checkuser2 = login2.nextLine();
			switch(checkuser2){
			case "1": System.out.println("Deposit moMoney: \n >: ");
			double amount = login2.nextDouble();
			login2.nextLine();
			double total = amount + u.getBalance();
			service.updateBalance(u.getBalance(), total);
			u.setBalance(total);
			break;
			case "2": System.out.println("Withdraw yoMoney: \n >: ");
			double amount2 = login2.nextDouble();
			login2.nextLine();
			double total2 = u.getBalance() - amount2;
			service.updateBalance(u.getBalance(), total2);
			u.setBalance(total2);
			break;
			case "3": System.out.println("Current balance: >: $" + u.getBalance());
			break;
			default: 
				System.out.println("You are exiting the program >: \n\n\t Goodbye");
				break;
			}

		} while(checkuser2.equals("4") == false);

		return u;
	}

	static User createAccount() {
		//try (){
		System.out.println(" Wellcome  ");
		User u = new User();
		Scanner create1 = new Scanner(System.in);

		String usercheck;
		//System.out.println("please enter your id: ");
		//int id = create1.nextInt();
		//u.setId(id);
		System.out.println("first name: ");
		usercheck = create1.nextLine();
		u.setFirstname(usercheck);
		System.out.println("last name: ");
		usercheck = create1.nextLine();
		u.setLastname(usercheck);
		System.out.println("Username: ");
		usercheck = create1.nextLine();
		u.setUsername(usercheck);
		System.out.println("Your password: ");
		usercheck = create1.nextLine();
		u.setPassword(usercheck);
		System.out.println("Please enter a deposit: ");
		double MoMoney = create1.nextDouble();
		u.setBalance(MoMoney);


		/*
		 * 
		 * This is for hard coding the users to be written to file. 
		 * 
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









