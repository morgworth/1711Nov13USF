package com.revature.pojo;

public class User {

	private int id;
	private String firstname, lastname, username, password;
	private double balance;
	
	public User() {
		
	}
	
	public User(String firstname, String lastname, String username, String password, double balance) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.balance = balance;
	}

	public User(int id, String firstname, String lastname, String username, String password, double balance) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.balance = balance;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return (double)balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String toFile() {
		return firstname + ":" + lastname + ":"
	+ username + ":" + password + ":" + balance + "\n";
	}

	public String backTo() {
		
		return firstname + ":" + lastname + ":" + password + ":" + balance + "\n";
	}
	
	
}
