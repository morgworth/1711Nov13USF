package com.ex.test;

import java.util.ArrayList;

import jdbcexamples.Artist;
import jdbcexamples.DAO;
import jdbcexamples.DAOImple;

public class MainTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DAO dao = new DAOImple();
		ArrayList<Artist> artists = dao.getArtists();
		/*for(Artist art:artists)
		{
			System.out.println(art.toString());
		}*/
		
		/*Artist art =dao.getArtbyid(4);
		System.out.println(art);*/
		System.out.println(dao.addArtist("bob"));
		//System.out.println(dao.UpdateArtist("Bill Gates", 503));
		//commit often
	}
}