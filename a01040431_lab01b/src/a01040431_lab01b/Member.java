/**
 * 
 */
package a01040431_lab01b;

/**
 * @author a01040431_Chiao yu
 *
 */
public class Member {

	private String firstName;
	private String lastName;
	private int month;
	private int year;

	public static final int FIRST_MONTH = 1;
	public static final int LAST_MONTH = 12;
	public static final int CURRENT_YEAR = 2018;
	public static final String DEFAULT_NAME = "unknown";

	/**
	 * 
	 */
	public Member() {
		super();
	}

	/**
	 * @param firstName a String to set the firstName field
	 * @param lastName  a String to set the lastName field
	 * @param month     a int to set the month field
	 * @param year      a int to set the year field
	 */
	public Member(String firstName, String lastName, int month, int year) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setMonth(month);
		setYear(year);
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

		if (firstName != null && !firstName.isEmpty()) {
			this.firstName = firstName;
		} else {
			System.out.println(DEFAULT_NAME);
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

		if (lastName != null && !lastName.isEmpty()) {

			this.lastName = lastName;
		} else {
			System.out.println(DEFAULT_NAME);
		}

	}

	/**
	 * @return the month as a int
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {

		if (month >= FIRST_MONTH && month <= LAST_MONTH) {

			this.month = month;
		}

	}

	/**
	 * @return the year as a int
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {

		if (year >= 0 && year <= CURRENT_YEAR)
			this.year = year;
	}

}
