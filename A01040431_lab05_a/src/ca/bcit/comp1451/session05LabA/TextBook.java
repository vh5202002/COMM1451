/**
 * 
 */
package ca.bcit.comp1451.session05LabA;

/**
 * @author choya
 *
 */
public class TextBook extends ReadingMaterial{
	private String editionNumber;
	private String authorName;
	private String subject;
	
	/**
	 * constructor 
	 * @param title
	 * @param numberOfPages
	 * @param editionNumber
	 * @param authorName
	 * @param subject
	 */
	public TextBook(String title, int numberOfPages, String editionNumber
			, String authorName, String subject) {
		
		super(title, numberOfPages);
		
		setEditionNumber(editionNumber);
		setAuthorName(authorName);
		setSubject(subject);
		
	}


	/**
	 * @return the editionNumber as a string
	 */
	public String getEditionNumber() {
		return editionNumber;
	}


	/**
	 * @param editionNumber the editionNumber to set
	 */
	public void setEditionNumber(String editionNumber) {
		this.editionNumber = editionNumber;
	}


	/**
	 * @return the authorName as a string
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


	/**
	 * @return the subject as a string
	 */
	public String getSubject() {
		return subject;
	}


	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	/**
	 * diplayDetails
	 */
	public void diplayDetails() {
		System.out.println("Title: " + getTitle());
		System.out.println("EditionNumbe: " + editionNumber);
		System.out.println("Author name: " + authorName);
		System.out.println("Subject: " + subject);
	}
	
	

}
