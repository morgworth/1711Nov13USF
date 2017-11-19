package com.rev.service;

import com.rev.dao.DAO;
import com.rev.dao.FileDAO;
import com.rev.pojos.User;

public class Service {

	
		static DAO dao = new FileDAO();
		
		public User addUser(User u) {
			// need to validate the user 
			// and add if does not exist
			
			dao.addUser(u);
			return u;
		}
		/*public User checkUser(User u) {
			
			dao.checkUser(u);
			return u;
			
		}
	*/
	
}
