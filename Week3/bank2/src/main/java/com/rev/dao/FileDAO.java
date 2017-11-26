package com.rev.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import com.rev.pojos.User;
import com.rev.util.ConnectionDAO;

import com.rev.pojos.User;

public class FileDAO implements DAO {

	@Override
	public ArrayList<User> getUsers(){
		ArrayList<User> Users = new ArrayList<>();

		try(Connection conn = ConnectionDAO.getInstance().getConnection();){
			String sql = "select * from User";
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);


			while(rs.next()) {
				User temp = new User();
				temp.setUserID(rs.getInt(1));
				temp.setUserName(rs.getString(2));
				Users.add(temp);

			}

		}catch (SQLException e) {
			e.printStackTrace();
		}

		return Users;
	}

	@Override
	public User getUserbyId(int id) {
		// TODO Auto-generated method stub
		// default build  return null;
		User art = new User();

		try(Connection conn = ConnectionDAO.getInstance().getConnection()){
			String sql = "select * from User where Userid = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet info = ps.executeQuery();

			while(info.next());{
				art.setUserID(info.getInt(1));
				art.setUserName(info.getString(2));

			}


		}catch (SQLException e) {
			e.printStackTrace();

		}

		return art;
	}



	@Override
	public User addUser(String name) {
		// TODO Auto-generated method stub
		//return null;

		User art = new User();

		try(Connection conn = ConnectionDAO.getInstance().getConnection()){
			conn.setAutoCommit(false);
			String sql = "insert into User (Name) values (?)";
			String[] key = new String[1];
			key[0] = "Userid";

			PreparedStatement ps = conn.prepareStatement(sql,key);
			ps.setString(1, name);
			int rows = ps.executeUpdate();
			if(rows!=0) {

				ResultSet pk = ps.getGeneratedKeys();
				while(pk.next()) {
					art.setUserID(pk.getInt(1));

				}

				art.setUserName(name);
				conn.commit();
			}
		}catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public User updateUser(int id, String newUser) {
		// TODO Auto-generated method stub

		User art = new User();



		try(Connection conn = ConnectionDAO.getInstance().getConnection()){
			conn.setAutoCommit(false);
			String sql = "UPDATE User SET NAME = ? WHERE Userid = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, newUser);
			ps.setInt(2, id);
			int check = ps.executeUpdate();

			if(check != 0) {
				conn.commit();
				art = getUserbyId(id);
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}

		return art;
	}

}
