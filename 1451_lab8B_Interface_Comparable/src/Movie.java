
public class Movie extends AudioMaterail {

	private String directorName;
	private int numberOfActors;
	/**
	 * @param name
	 * @param playingTimeInMinutes
	 * @param directorName
	 * @param numberOfActors
	 */
	public Movie(String name, double playingTimeInMinutes, String directorName, int numberOfActors) {
		super(name, playingTimeInMinutes);
		this.directorName = directorName;
		this.numberOfActors = numberOfActors;
	}
	/**
	 * @return the directorName
	 */
	public String getDirectorName() {
		return directorName;
	}
	/**
	 * @param directorName the directorName to set
	 */
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	/**
	 * @return the numberOfActors
	 */
	public int getNumberOfActors() {
		return numberOfActors;
	}
	/**
	 * @param numberOfActors the numberOfActors to set
	 */
	public void setNumberOfActors(int numberOfActors) {
		this.numberOfActors = numberOfActors;
	}
	
	

}
