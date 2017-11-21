package com.rev.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.rev.dao.DAO;
import com.rev.dao.FileDAO;
import com.rev.pojos.User;


public class Service {

	static String filename = "src/main/resources/bank.txt";
	static DAO dao = new FileDAO();

	public User addUser(User u) {
		// need to validate the user 
		// and add if does not exist

	


		if(existsUser(u) == false) {

			dao.addUser(u);
			

		}else {
			
			System.out.println("This username is already in use.");
			;
		}

		return u;
	}

	public User getUser(User u) {

		
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line = null;
			while((line=br.readLine())!=null){
				String[] about = line.split(", ");
				if (u.getUsername().equals(about[3])){
					u.setFirstname(about[1]);
					u.setLastname(about[2]);
					u.setUsername(about[3]);
					u.setPassword(about[4]);
					double d = Double.parseDouble(about[5]);
					u.setBalance(d);
					return u;
				}
				
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public boolean existsUser (User u) {
		

		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line = null;
			while((line=br.readLine())!=null){
				String[] about = line.split(", ");
				if (u.getUsername().equals(about[3])){
					return true;
				}
				
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/* was used with no check. 
		//return u;
		*/
		
		return false;
		
		
	}
	
	public void updateBalance(double olmoney, double newmoney) {
		String oldfile = "";
		
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line = null;
			while((line=br.readLine())!=null){
				oldfile = oldfile + line + System.lineSeparator();				
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String newfile = oldfile.replaceAll(Double.toString(olmoney), Double.toString(newmoney));
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename,true))){
			// should not be able to add users with a username that already 
			// exists add logic to validate inside of service AKA business layer
			
			bw.write(newfile);
			
		
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
		
}	
		
		
		




