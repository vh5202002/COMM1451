/**
 * 
 */
package a01040431_lab08a;

/**
 * @author choya
 *
 */
public class HourlyEmployee extends Employee{
	private double hours;
	private static final double hourlyWage = 20.5;
	
	/**
	 * default constructor 
	 */
	public HourlyEmployee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * Overloaded constructor
	 * @param name the name to set
	 * @param hours the hours to set
	 */
	public HourlyEmployee(String name, double hours) {
		super(name);
		// TODO Auto-generated constructor stub
		setHours(hours);
	}

	/**
	 * @return the hours as double
	 */
	public double getHours() {
		return hours;
	}

	/**
	 * @param hours the hours to set
	 */
	public void setHours(double hours) {
		if(hours > 0) {
			this.hours = hours;
		}
	}

	/**
	 * @return the hourlyWage as double
	 */
	public static double getHourlyWage() {
		return hourlyWage;
	}



	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HourlyEmployee [hours=" + hours + ", toString()=" + super.toString() + "]";
	}

	/**
	 * implementation of abstract method calculateMonthlyEarnings
	 */
	public double calculateMonthlyEarnings() {
		return hours * hourlyWage;
	};
	

}
