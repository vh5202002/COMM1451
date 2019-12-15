/**
 * 
 */
package ca.bcit.comp1451.session05LabA;

/**
 * @author choya
 *
 */
public class Magazine extends ReadingMaterial{
	
	private String scheduledPublications;
	private int numberOfSubscribers;

	/**
	 * constructor
	 * @param title
	 * @param numberOfPages
	 * @param scheduledPublications
	 * @param numberOfSubscribers
	 */
	public Magazine(String title, int numberOfPages, String scheduledPublications,
			int numberOfSubscribers) {
		super(title, numberOfPages);
		setScheduledPublications(scheduledPublications);
		setNumberOfSubscribers(numberOfSubscribers);
	}

	/**
	 * @return the scheduledPublications as a string
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
	 * @return the numberOfSubscribers as a int
	 */
	public int getNumberOfSubscribers() {
		return numberOfSubscribers;
	}

	/**
	 * @param numberOfSubscribers the numberOfSubscribers to set
	 */
	public void setNumberOfSubscribers(int numberOfSubscribers) {
		this.numberOfSubscribers = numberOfSubscribers;
	}

	/**
	 * diplayDetails
	 */
	public void diplayDetails() {
		System.out.println("Title: " + getTitle());
		System.out.println("Scheduled Publications: " + scheduledPublications);
		System.out.println("Number of Subscribers: " + numberOfSubscribers);
	}
	

}
