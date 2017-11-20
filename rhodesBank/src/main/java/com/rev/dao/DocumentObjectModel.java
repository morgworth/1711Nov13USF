package com.rev.dao;

import com.rev.pojos.User;

public interface DocumentObjectModel {
	
	User addUser(User u);
	User getUser(String username);
	User existsUser(User u);
	User existsBalance(double balance);

}
