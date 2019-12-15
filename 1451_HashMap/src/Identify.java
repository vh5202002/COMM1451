
public class Identify {

	private String firstName;
	private String lastName;
	private String emailAdd;
	private String id;
	/**
	 * @param firstName
	 * @param lastName
	 * @param emailAdd
	 * @param id
	 */
	public Identify(String firstName, String lastName, String emailAdd, String id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAdd = emailAdd;
		this.id = id;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the emailAdd
	 */
	public String getEmailAdd() {
		return emailAdd;
	}
	/**
	 * @param emailAdd the emailAdd to set
	 */
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Identify [firstName=" + firstName + ", lastName=" + lastName + ", emailAdd=" + emailAdd + ", id=" + id
				+ "]";
	}
	


}
