
public class Album extends AudioMaterail{

	private int numberOfSongs;
	private String artistName;
	/**
	 * @param name
	 * @param playingTimeInMinutes
	 * @param numberOfSongs
	 * @param artistName
	 */
	public Album(String name, double playingTimeInMinutes, int numberOfSongs, String artistName) {
		super(name, playingTimeInMinutes);
		this.numberOfSongs = numberOfSongs;
		this.artistName = artistName;
	}
	/**
	 * @return the numberOfSongs
	 */
	public int getNumberOfSongs() {
		return numberOfSongs;
	}
	/**
	 * @param numberOfSongs the numberOfSongs to set
	 */
	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = numberOfSongs;
	}
	/**
	 * @return the artistName
	 */
	public String getArtistName() {
		return artistName;
	}
	/**
	 * @param artistName the artistName to set
	 */
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	
	

}
