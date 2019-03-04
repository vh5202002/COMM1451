/**
 * 
 */
package a01040431_lab05b;

/**
 * @author choya
 *
 */
public class UserInformation {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String bcitId;

	/**
	 * Default Constructor
	 */
	public UserInformation() {
		super();
	}

	/**
	 * @param firstName to set firstName field
	 * @param lastName to set lastName field
	 * @param emailAddress to set emailAddress field
	 * @param bcitId to set bcitId field
	 */
	public UserInformation(String firstName, String lastName, String emailAddress, String bcitId) {
		setFirstName(firstName);
		setLastName(lastName);
		setEmailAddress(emailAddress);
		setBcitId(bcitId);
	}

	/**
	 * @return the firstName as a String
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set 
	 */
	public void setFirstName(String firstName) {
		if(firstName != null && firstName.length() > 0) {
			this.firstName = firstName;
		}	
	}

	/**
	 * @return the lastName as a String 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if(lastName != null && lastName.length() > 0) {
			this.lastName = lastName;
		}
	}

	/**
	 * @return the emailAddress as a String
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		if(emailAddress != null && emailAddress.length() > 0) {
			this.emailAddress = emailAddress;
		}
	}

	/**
	 * @return the bcitId as a String
	 */
	public String getBcitId() {
		return bcitId;
	}

	/**
	 * @param bcitId the bcitId to set
	 */
	public void setBcitId(String bcitId) {
		if(bcitId != null && bcitId.length() > 0) {
			this.bcitId = bcitId;
		}
	}
	
	/**
	 * displayDetails
	 */
	public void displayDetails() {
		System.out.println("Name: " + getFirstName() + " " + getLastName());
		System.out.println("Email: " + getEmailAddress());
		
	}

	
}
