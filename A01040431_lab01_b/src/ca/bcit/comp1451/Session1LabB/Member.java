/**
 * 
 */
package ca.bcit.comp1451.Session1LabB;

/**
 * @author choya
 *
 */
public class Member {
	
	private String firstName;
	private String lastName;
	private int joinOfMonth;
	private int joinOfyear;
	
	public static final int FIRST_MONTH = 1;
	public static final int LAST_MONTH = 12;
	public static final int CURRENT_YEAR = 2018;
	public static final String DEFAULT_NAME = "unknown";


	/**
	 * @param firstName a String to set of the firstName field
	 * @param lastName  a String to set of the lastName field
	 * @param joinOfMonth a int to set of the joinOfMonth field
	 * @param joinOfyear a int to set of the joinOfyear field
	 */
	public Member(String firstName, String lastName, int joinOfMonth, int joinOfyear) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setJoinOfMonth(joinOfMonth);
		setJoinOfyear(joinOfyear);
	}

	/**
	 * @return the firstName as a string
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		if(firstName != null && !firstName.isEmpty()) {
			this.firstName = firstName;
		}else {
			//System.out.println(DEFAULT_NAME);
			throw new IllegalArgumentException("Please enter your first name. ");
		}
	}

	/**
	 * @return the lastName as a string
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		if(lastName != null && !lastName.isEmpty()) {
			this.lastName = lastName;
		}else {
			//System.out.println(DEFAULT_NAME);
			throw new IllegalArgumentException("Please enter your last name.");
		}
	}

	/**
	 * @return the joinOfMonth as a ing 
	 */
	public int getJoinOfMonth() {
		return joinOfMonth;
	}

	/**
	 * @param joinOfMonth the joinOfMonth to set
	 */
	public void setJoinOfMonth(int joinOfMonth) {
		if(joinOfMonth >= FIRST_MONTH && joinOfMonth <= LAST_MONTH) {
			this.joinOfMonth = joinOfMonth;
		}else {
			this.joinOfMonth = FIRST_MONTH;
		}
	}

	/**
	 * @return the joinOfyear as a int
	 */
	public int getJoinOfyear() {
		return joinOfyear;
	}

	/**
	 * @param joinOfyear the joinOfyear to set
	 */
	public void setJoinOfyear(int joinOfyear) {
		if(joinOfyear > 0 && joinOfyear <= CURRENT_YEAR) {
			this.joinOfyear = joinOfyear;
		}else {
			throw new IllegalArgumentException(" invalid error. ");
		}
	}

//	public static void main(String[] args) {
//		for(String s : args) {
//			System.out.println(s);
//		}
//	}
}
