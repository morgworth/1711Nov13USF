package co.ex.pojos;

public class Artist {

	private int 	artistID;
	private String artistName;
	
	public Artist() {}
	
	public Artist(int artistID, String artistName) {
		super();
		this.artistID = artistID;
		this.artistName = artistName;
	}



	public int getArtistID() {
		return artistID;
	}



	public void setArtistID(int artistID) {
		this.artistID = artistID;
	}



	public String getArtistName() {
		return artistName;
	}



	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}


	
	
	




}
