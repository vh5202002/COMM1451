
public class Magazine extends ReadingMaterial{
	
	private String scheduledPublications;
	private int numOfSubscribers;
	/**
	 * @param title
	 * @param numberOfPages
	 */
	public Magazine(String title, int numberOfPages, String scheduledPublications,
			int numOfSubscribers) {
		super(title, numberOfPages);
		setScheduledPublications(scheduledPublications);
		setNumOfSubscribers(numOfSubscribers);
	}
	/**
	 * @return the scheduledPublications
	 */
	public String getScheduledPublications() {
		return scheduledPublications;
	}
	/**
	 * @param scheduledPublications the scheduledPublications to set
	 */
	public void setScheduledPublications(String scheduledPublications) {
		this.scheduledPublications = scheduledPublications;
	}
	/**
	 * @return the numOfSubscribers
	 */
	public int getNumOfSubscribers() {
		return numOfSubscribers;
	}
	/**
	 * @param numOfSubscribers the numOfSubscribers to set
	 */
	public void setNumOfSubscribers(int numOfSubscribers) {
		this.numOfSubscribers = numOfSubscribers;
	}
	
	public void displayDetails() {
		System.out.println("title: " + getTitle());
		System.out.println("scheduled publications: " + scheduledPublications);
		System.out.println("number of subscribers" + numOfSubscribers);
	}
	
}
