
public class Instructor extends Identify{
	
	private int hourlyWage;

	/**
	 * @param firstName
	 * @param lastName
	 * @param emailAdd
	 * @param id
	 * @param hourlyWage
	 */
	public Instructor(String firstName, String lastName, String emailAdd, String id, int hourlyWage) {
		super(firstName, lastName, emailAdd, id);
		this.hourlyWage = hourlyWage;
	}

	/**
	 * @return the hourlyWage
	 */
	public int getHourlyWage() {
		return hourlyWage;
	}

	/**
	 * @param hourlyWage the hourlyWage to set
	 */
	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}


}
