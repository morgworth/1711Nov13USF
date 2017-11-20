package com.rev.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.rev.pojos.User;

public class FileDAO implements DAO{

	String filename = "src/main/resources/bank.txt";
	public User addUser(User u) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
			//should not be able to add users with a username that already exists
			//add logic to validate inside of service AKA business layer
			bw.write(u.toFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public User getUser(String uName) {
		try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line = null;
			while((line = br.readLine()) != null) {
				String[] about = line.split(":");
				User u = new User();
				if(uName.equals(about[3])) {
					u.setId(Integer.parseInt(about[0]));
					u.setfName(about[1]);
					u.setlName(about[2]);
					u.setuName(about[3]);
					u.setPassword(about[4]);
					u.setBalance(Double.parseDouble(about[5]));
					return u;
				}
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}