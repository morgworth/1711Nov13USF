package com.rev.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.rev.pojos.User;

public class FileDAO implements DAO {

	String filename = "src/main/resources/bank.txt";
	public User addUser(User u) {
		
		//https://stackoverflow.com/questions/24671665/check-if-input-already-exists-in-textfile-with-java
		// example of what I need to do.
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename,true))){
	  		// should not be able to add users with a username that already 
			// exists add logic to validate inside of service AKA business layer
			
		
			bw.write(u.toFile());
			
		
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public User getUser(String username) {
		// auto-gen method stub
		return null;
		
	}
	
}
