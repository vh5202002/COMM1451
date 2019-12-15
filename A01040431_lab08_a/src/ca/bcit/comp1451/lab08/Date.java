/**
 * 
 */
package ca.bcit.comp1451.lab08;

import java.util.HashMap;

/**
 * @author choya
 *
 */
public class Date implements Displayable{
	
	private int day;
	private int month;
	private int year;
	
	private static final int FIRST_DAY = 1;
	private static final int LAST_DAY = 31;
	private static final int FIRST_MONTH = 1;
	private static final int LAST_MONTH = 12;
	private static final int YEAR = 1900;
	private static final int CURRENT_YEAR = 2019;
	private HashMap<Integer , String> monthNames;
	
	/**
	 * @param day
	 * @param month
	 * @param year
	 */
	public Date(int day, int month, int year) {
		super();
		setDay(day);
		setMonth(month);
		setYear(year);
		monthNames = new HashMap<Integer , String>();
		populateHashMap();
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
		if(day >= FIRST_DAY && day <= LAST_DAY) {
			this.day = day;
		}else {
			this.day = FIRST_DAY;
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
			this.month = LAST_MONTH;
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
		if(year >= YEAR && year <= CURRENT_YEAR) {
			this.year = year;
		}else {
			this.year = YEAR;
		}
	}
	
	/**
	 * populateHashMap
	 */
	public void populateHashMap() {
	
		String monthName;
		switch(month) {
		
		case 1: monthName = "January";
		monthNames.put(month, monthName);
		break;
		
		case 2: monthName = "February";
		monthNames.put(month, monthName);
		break;
		
		case 3: monthName = "March";
		monthNames.put(month, monthName);
		break;
		
		case 4: monthName = "April";
		monthNames.put(month, monthName);
		break;
		
		case 5: monthName = "May";
		monthNames.put(month, monthName);
		break;
		
		case 6: monthName = "June";
		monthNames.put(month, monthName);
		break;
		
		case 7: monthName = "July";
		monthNames.put(month, monthName);
		break;
		
		case 8: monthName = "August";
		monthNames.put(month, monthName);
		break;
		
		case 9: monthName = "September";
		monthNames.put(month, monthName);
		break;
		
		case 10: monthName = "October";
		monthNames.put(month, monthName);
		break;
		
		case 11: monthName = "November";
		monthNames.put(month, monthName);
		break;
		
		case 12: monthName = "December";
		monthNames.put(month, monthName);
		break;
		
		default:
			monthName = "Invalid";
		
		}
	
		
		
	}
	
	public String getStringValue () {
		
		String output =  day + " " + monthNames.get(month) + " " + year;
		String output2 = "0" + day + " " + monthNames.get(month) + " " + year;
		if(day < 10) {
			return "(" + output2 + ")";
		}else {
			return "(" + output + ")";
		}
		
	}
	
	

}
