
public class AudioBook extends AudioMaterail{

	private int totalNumberOfPages;
	private String authorName;
	/**
	 * @param name
	 * @param playingTimeInMinutes
	 * @param totalNumberOfPages
	 * @param authorName
	 */
	public AudioBook(String name, double playingTimeInMinutes, int totalNumberOfPages, String authorName) {
		super(name, playingTimeInMinutes);
		this.totalNumberOfPages = totalNumberOfPages;
		this.authorName = authorName;
	}
	/**
	 * @return the totalNumberOfPages
	 */
	public int getTotalNumberOfPages() {
		return totalNumberOfPages;
	}
	/**
	 * @param totalNumberOfPages the totalNumberOfPages to set
	 */
	public void setTotalNumberOfPages(int totalNumberOfPages) {
		this.totalNumberOfPages = totalNumberOfPages;
	}
	/**
	 * @return the authorName
	 */
	public String getAuthorName() {
		return authorName;
	}
	/**
	 * @param authorName the authorName to set
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
	

}
