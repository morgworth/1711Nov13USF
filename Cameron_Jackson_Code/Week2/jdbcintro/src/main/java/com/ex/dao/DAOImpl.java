package com.ex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ex.pojos.Artist;
import com.ex.util.ConnectionFactory;

public class DAOImpl implements DAO {
	
	@Override
	public ArrayList<Artist> getArtists() {
		ArrayList<Artist> artists = new ArrayList<Artist>();
		try (Connection conn = ConnectionFactory.getInstance().getConnection();) {
			String sql = "SELECT * FROM artist";
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				Artist temp = new Artist();
				temp.setId(rs.getInt(1)); // rs.get... functions can take column index or column name
				temp.setName(rs.getString(2));
				artists.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return artists;
	}

	@Override
	public Artist getArtistById(int id) {
		Artist art = new Artist();
		
		try (Connection conn = ConnectionFactory.getInstance().getConnection()) {
			String sql = "SELECT * FROM artist\r\n" + 
					"WHERE artistid = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet info = ps.executeQuery();
			
			while (info.next()) {
				art.setId(info.getInt(1));
				art.setName(info.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return art;
	}

	@Override
	public Artist addArtist(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
