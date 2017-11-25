package com.rev.dao;

import com.rev.pojos.User;

public interface DAO {
	
	
	/*
	 * Any of the classes that implement the functions listed here( or in any interface) must be 
	 * defined in the class that uses this interface. 
	 * So, the FileDAO must have both addUser and getUser to be able to implement DAO interface.
	 */
	
	User addUser(User u);  // due to this ending in a semi-colon and that it is not implemented. 
						   // this is called a prototype. I will add the javadoc later. 
	 
	User getUser(String username);
	
	
	
	
}
