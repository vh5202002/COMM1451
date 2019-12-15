
public class TextBook extends ReadingMaterial{
	
	private String editionNum;
	private String authorName;
	private String subject;
	/**
	 * @param title
	 * @param numberOfPages
	 */
	public TextBook(String title, int numberOfPages, String editionNum,
			String authorName, String subject) {
		super(title, numberOfPages);
		setEditionNum(editionNum);
		setAuthorName(authorName);
		setSubject(subject);
	}
	/**
	 * @return the editionNum
	 */
	public String getEditionNum() {
		return editionNum;
	}
	/**
	 * @param editionNum the editionNum to set
	 */
	public void setEditionNum(String editionNum) {
		this.editionNum = editionNum;
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
	/**
	 * @return the subject
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
	public void displayDetails() {
		System.out.println("title: " + getTitle());
		System.out.println("edition number: " + editionNum);
		System.out.println("author name: " + authorName);
		System.out.println("subject: " + subject);
	}
	
}
