package com.ex.dao;

import java.util.ArrayList;

import co.ex.pojos.Artist;

public interface DAO {

	public ArrayList<Artist> getArtists();
	public Artist getArtistbyId(int id);
	public Artist addArtist(String name);
	public Artist updateArtist(int id, String newArtist);
	
}
