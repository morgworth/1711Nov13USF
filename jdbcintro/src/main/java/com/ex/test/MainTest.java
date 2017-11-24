package com.ex.test;

import java.util.ArrayList;
import com.ex.dao.DAOImpl;
import co.ex.pojos.Artist;


public class MainTest {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DAOImpl dao = new DAOImpl();
		//ArrayList<Artist> artists = dao.getArtists();
			
			
		 	//for(Artist art : artists) {
			
			//System.out.println(art);
			
		    //Artist art = dao.getArtistbyId(4);
		    
		    //System.out.println(art);
		System.out.println(dao.addArtist("Vic Menda"));
		//System.out.println(dao.addArtist("Vic Menda"));
			
		}
		
	}


