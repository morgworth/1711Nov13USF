package com.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ex.util.ConnectionFactory;

import co.ex.pojos.Artist;

public class DAOImpl  implements DAO {

	@Override
	public ArrayList<Artist> getArtists(){
		ArrayList<Artist> artists = new ArrayList<>();

		try(Connection conn = ConnectionFactory.getInstance().getConnection();){
			String sql = "select * from artist";
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);


			while(rs.next()) {
				Artist temp = new Artist();
				temp.setArtistID(rs.getInt(1));
				temp.setArtistName(rs.getString(2));
				artists.add(temp);

			}

		}catch (SQLException e) {
			e.printStackTrace();
		}

		return artists;
	}

	@Override
	public Artist getArtistbyId(int id) {
		// TODO Auto-generated method stub
		// default build  return null;
		Artist art = new Artist();

		try(Connection conn = ConnectionFactory.getInstance().getConnection()){
			String sql = "select * from artist where artistid = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet info = ps.executeQuery();

			while(info.next());{
				art.setArtistID(info.getInt(1));
				art.setArtistName(info.getString(2));

			}


		}catch (SQLException e) {
			e.printStackTrace();

		}

		return art;
	}



	@Override
	public Artist addArtist(String name) {
		// TODO Auto-generated method stub
		//return null;

		Artist art = new Artist();

		try(Connection conn = ConnectionFactory.getInstance().getConnection()){
			conn.setAutoCommit(false);
			String sql = "insert into artist (Name) values (?)";
			String[] key = new String[1];
			key[0] = "artistid";

			PreparedStatement ps = conn.prepareStatement(sql,key);
			ps.setString(1, name);
			int rows = ps.executeUpdate();
			if(rows!=0) {

				ResultSet pk = ps.getGeneratedKeys();
				while(pk.next()) {
					art.setArtistID(pk.getInt(1));

				}

				art.setArtistName(name);
				conn.commit();
			}
		}catch (SQLException e) {
			e.printStackTrace();

		}
		return null;
	}

	@Override
	public Artist updateArtist(int id, String newArtist) {
		// TODO Auto-generated method stub

		Artist art = new Artist();



		try(Connection conn = ConnectionFactory.getInstance().getConnection()){
			conn.setAutoCommit(false);
			String sql = "UPDATE ARTIST SET NAME = ? WHERE artistid = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, newArtist);
			ps.setInt(2, id);
			int check = ps.executeUpdate();

			if(check != 0) {
				conn.commit();
				art = getArtistbyId(id);
			}


		} catch (SQLException e) {
			e.printStackTrace();
		}

		return art;
	}

}



