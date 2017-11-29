package com.bank.test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.bank.pojos.User;
import com.bank.pojos.Account;
import com.bank.util.Service;

/**
 * 
 * @author Ihsan Taha
 * 
 *         The following program allows users to create a bank account or login
 *         to an existing account and update their balance. The program does not
 *         allow duplicate user names nor invalid user input at any point.
 *
 */
public class MainTest
{
	// Create a service to manage user data
	static Service service = new Service();

	public static void main(String[] args)
	{
		System.out.println(
				"Welcome to USF Bank!\nWhen prompted to select an option, please type in the number associated with the command.");
		run();
	}

	// Create an account or login to an existing one
	static void run()
	{
		System.out.println("\nSelect an option below:\n1- Login\n2- Sign up");

		Scanner scan = new Scanner(System.in);
		String option = scan.nextLine();
		switch (option)
		{
		case "1":
			login();
			break;
		case "2":
			createUser();
			break;
		default:
			System.out.println("You have entered an invalid answer. Please try again.");
			run();
		}
	}

	// Login to account with a valid username and associated password
	static User login()
	{
		User user = new User();

		System.out.println("\nPlease enter your username: ");
		Scanner scan = new Scanner(System.in);
		String option = scan.nextLine();
		user.setUserName(option);

		System.out.println("Please enter your password: ");
		scan = new Scanner(System.in);
		option = scan.nextLine();
		user.setPassWord(option);

		if (service.getUser(user) != null)
			accessAccountService(service.getUser(user));
		else
		{
			System.out.println("Sorry, you have entered an invalid user account. Please try again.");
			run();
		}

		return null;
	}

	// Create a new account with a unique username, otherwise return to main menu
	static User createUser()
	{
		User user = new User();

		System.out.print("Please enter your first name:\t");
		Scanner scan = new Scanner(System.in);
		String option = scan.nextLine();
		user.setFirstName(option);
		System.out.println();

		System.out.print("Please enter your last name:\t");
		scan = new Scanner(System.in);
		option = scan.nextLine();
		user.setLastName(option);
		System.out.println();

		System.out.print("Please enter your username:\t");
		scan = new Scanner(System.in);
		option = scan.nextLine();
		user.setUserName(option);
		System.out.println();

		System.out.print("Please enter your password:\t");
		scan = new Scanner(System.in);
		option = scan.nextLine();
		user.setPassWord(option);
		System.out.println();

		if (service.addUser(user) != null)
			accessAccountService(service.getUser(user));
		else
		{
			System.out.println("Sorry, the username you entered already exists.");
			run();
		}

		return null;
	}

	// Create an account, delete an account, or access an account
	static void accessAccountService(User user)
	{
		Account account = new Account();

		System.out.println("\nHello " + user.getFirstName()
				+ ", select an option below:\n1- Create New Account\n2- Access Account\n3- Log out");

		Scanner scan = new Scanner(System.in);
		String option = scan.nextLine();

		switch (option)
		{

		case "1":
			createAccount(user);
		case "2":
			selectAccount(user);
		case "3":
			run();
		case "0":
			service.deleteUser(user.getUserId());
			run(); 
		default:
			System.out.println("You have entered an invalid answer. Please try again.");
			accessAccountService(user);
		}
	}

	// Create an account
	static void createAccount(User user)
	{
		service.addAccount(user);
		selectAccount(user);
	}

	static void selectAccount(User user)
	{
		ArrayList<Account> accounts = service.getAllAccounts(user);

		// Proceed if the user has at least one account
		if (accounts.size() > 0)
		{
			// Enter the account id you wish to access from the list of options
			System.out.println("\nSelect an account from the provided ID list:");
			
			for (int i = 0; i < accounts.size(); i++)
				System.out.print(accounts.get(i).getAccountId() + "\t");

			System.out.println();
			boolean validAccount = false;
			do
			{
				Scanner scan = new Scanner(System.in);
				int op = scan.nextInt();
				// If the account id is valid, access it, otherwise try again
				if (service.getAccount(op) != null)
				{
					accessAccount(user, service.getAccount(op));
					validAccount = true;
				} else
				{
					System.out.println("You have entered an invalid answer. Please try again.");
					System.out.println("\nSelect an account from the provided ID list:");
					accounts = service.getAllAccounts(user);
					validAccount = false;
				}
			} while (validAccount == false);
		} else
		{
			System.out.println("You do not have any accounts set up. Please create an account before accessing it.");
			accessAccountService(user);
		}
	}

	// Withdraw, deposit, or view balance and update accordingly to file
	static void accessAccount(User user, Account account)
	{
		System.out.println("\n----------------------------------------");
		System.out.println("Account: " + account.getAccountId());
		viewBalance(user, account);
		System.out.println(
				"Select an option below:\n1- Withdraw Money\n2- Deposit Money\n3- Switch Account\n4- Delete Account\n5- Return to Main Menu\n6- Log out");

		Scanner scan = new Scanner(System.in);
		String option = scan.nextLine();
		switch (option)
		{
		case "1":
			withdrawMoney(user, account);
		case "2":
			depositMoney(user, account);
		case "3":
			selectAccount(user);
		case "4":
			service.deleteAccount(account.getAccountId());
			selectAccount(user);
		case "5":
			accessAccountService(user);
		case "6":
			run();
		default:
			System.out.println("You have entered an invalid answer. Please try again.");
			accessAccount(user, account);
		}
	}

	// Withdraw money equal or less to the current balance
	static void withdrawMoney(User user, Account account)
	{
		double amount = 0.0d;

		do
		{
			// For all but the first iteration, check amount
			if (amount > account.getBalance())
				System.out.println("You do not have sufficient funds. Please try again.");

			System.out.println("How much money would you like to withdraw? ");
			Scanner scanWithdraw = new Scanner(System.in);
			try
			{
				amount = scanWithdraw.nextDouble();
			} catch (InputMismatchException e)
			{
				System.out.println("You have entered an invalid answer. Please Try again.");
				withdrawMoney(user, account);
			}

		} while (amount > account.getBalance());

		account.setBalance(account.getBalance() - amount);
		service.updateAccount(account);
		accessAccount(user, account);
	}

	// Deposit money into current balance
	static void depositMoney(User user, Account account)
	{
		double amount = 0.0d;

		do
		{
			// For all but the first iteration, check amount
			if (amount < 0)
				System.out.println("You have entered an invalid amount. Please try again.");

			System.out.println("How much money would you like to deposit? ");
			Scanner scanDeposit = new Scanner(System.in);
			try
			{
				amount = scanDeposit.nextDouble();
			} catch (InputMismatchException e)
			{
				System.out.println("You have entered an invalid answer. Please Try again.");
				continue;
			}

		} while (amount <= 0);

		account.setBalance(amount + account.getBalance());
		service.updateAccount(account);
		accessAccount(user, account);
	}

	// View current balance
	static void viewBalance(User user, Account account)
	{
		System.out.println("Current Balance: " + account.getBalance());
		System.out.println("----------------------------------------");
	}
}