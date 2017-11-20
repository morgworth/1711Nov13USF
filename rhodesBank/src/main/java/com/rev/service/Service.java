package com.rev.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.rev.dao.DAO;
import com.rev.dao.FileDAO;
import com.rev.pojos.User;


public class Service {

	static String filename = "/src/main/resources/bank.txt";
	static DAO dao = new FileDAO();

	public User addUser(User u) {
		// need to validate the user 
		// and add if does not exist




		if(existsUser(u) == false) {

			dao.addUser(u);
			return u;

		}else {
			
			System.out.println("This username is taken.");
			return u;
		}

		return u;
	}

	public User existsUser(User u) {

		
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line = null;
			while((line=br.readLine())!=null){
				String[] about = line.split(":");
				if (u.getUsername().equals(about[3])){
					return u;
				}
				
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return u;
	}

		
}	
		
		
		



