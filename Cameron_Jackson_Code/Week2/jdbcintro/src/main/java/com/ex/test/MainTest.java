package com.ex.test;

import java.util.ArrayList;

import com.ex.dao.DAO;
import com.ex.dao.DAOImpl;
import com.ex.pojos.Artist;

public class MainTest {
	public static void main(String[] args) {
		DAO dao = new DAOImpl();
		
//		ArrayList<Artist> artists = dao.getArtists();
//		
//		for (Artist art : artists) {
//			System.out.println(art);
//		}
		
		Artist art = dao.getArtistById(6);
		System.out.println(art);
	}
}
