package com.rev.pojos;

public class Login {
	
	private String UserExists;
	private String UserChange;
	private double ExistingBalance;
	
	
	public Login() {}
	
	public Login(String userExists, String userChange, double existingBalance) {
		super();
		UserExists = userExists;
		UserChange = userChange;
		ExistingBalance = existingBalance;
	}
	

	public String getUserExists() {
		return UserExists;
	}
	public void setUserExists(String userExists) {
		UserExists = userExists;
	}
	public String getUserChange() {
		return UserChange;
	}
	public void setUserChange(String userChange) {
		UserChange = userChange;
	}
	public double getExistingBalance() {
		return ExistingBalance;
	}
	public void setExistingBalance(double existingBalance) {
		ExistingBalance = existingBalance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
