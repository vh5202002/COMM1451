
public class Date implements Displayable{

	private int day;
	private int month;
	private int year;
	
	private static final int FIRST_DAY = 1;
	private static final int LAST_DAY = 31;
	private static final int FIRST_MONTH = 1;
	private static final int LAST_MONTH = 12;
	private static final int START_YEAR = 1900;
	private static final int CURRENT_YEAR = 2019;
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}
	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
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
		this.month = month;
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
		this.year = year;
	}
	
	public String getStringValue() {
		return "ss";
	}
	
}
