package ca.bcit.comp1451.Session1LabB;

public class Member {
	
	private String firstName;
	private String lastName;
	private int month; //join
	private int year; // join
	
	public static final int FIRST_MONTH = 1;
	public static final int LAST_MONTH = 12;
	public static final int CURRENT_YEAR = 2018;
	public static final String DEFAULT_NAME = "nuknown";
	/**
	 * @param firstName
	 * @param lastName
	 * @param month
	 * @param year
	 */
	public Member(String firstName, String lastName, int month, int year) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setMonth(month);
		setYear(year);
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
		if(firstName != null && !firstName.isEmpty()) {
			this.firstName = firstName;
		}else {
			throw new IllegalArgumentException("");
		}
		
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
		if(lastName != null && !lastName.isEmpty()) {
			this.lastName = lastName;
		}else {
			throw new IllegalArgumentException("");
		}
		
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		if(month >= FIRST_MONTH && month <= LAST_MONTH) {
			this.month = month;
		}else {
			throw new IllegalArgumentException("");
		}
		
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		if(year <= CURRENT_YEAR) {
			this.year = year;
		}else {
			throw new IllegalArgumentException("");
		}
		
	}
	
	


}
