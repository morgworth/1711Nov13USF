package com.rev.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class ConnectionDAO {

	
	private static ConnectionDAO cf = null;
	private static Boolean build = true;
	
	private ConnectionDAO() {
			build = false;
	}
	
	
	/*
	 * provides method callers with the CF object
	 * -- synchronized to prevent 2 threads from 
	 *  creating thread object simultaneously
	 * 
	 */
	
	
	public static synchronized ConnectionDAO getInstance() {
		if(build== true) {
			cf = new ConnectionDAO();
			
			
		}
		return cf;
	}
	public Connection getConnection() {
		Connection conn = null;
		
		
		Properties prop = new Properties();
		
		
		try {
			prop.load(new FileReader("C://Users//akrhodey//my_git_repos//1711Nov13USF//jdbcintro//src//main//resources//application.properties"));
			Class.forName(prop.getProperty("driver"));
			conn = DriverManager.getConnection( 
					prop.getProperty("url"),
					prop.getProperty("usr"),
					prop.getProperty("pwd"));
		 
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	
}

