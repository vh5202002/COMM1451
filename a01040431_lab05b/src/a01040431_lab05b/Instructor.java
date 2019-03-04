/**
 * 
 */
package a01040431_lab05b;

/**
 * @author choya
 *
 */
public class Instructor extends UserInformation{
	
	private double hourlyWage;

	/**
	 * default constructor
	 */
	public Instructor() {}
	

	/**
	 * @param firstName to set firstName field
	 * @param lastName to set lastName field
	 * @param emailAddress to set emailAddress field
	 * @param bcitId to set bcitId field
	 * @param hourlyWage to set hourlyWage field 
	 */
	public Instructor(String firstName, String lastName, String emailAddress,
			String bcitId, double hourlyWage) {
		super(firstName, lastName, emailAddress, bcitId);
		
		setHourlyWage(hourlyWage);
	}

	/**
	 * @return the hourlyWage as a double
	 */
	public double getHourlyWage() {
		return hourlyWage;
	}


	/**
	 * @param hourlyWage the hourlyWage to set
	 */
	public void setHourlyWage(double hourlyWage) {
		if(hourlyWage > 0) {
			this.hourlyWage = hourlyWage;
		}
	}

}
