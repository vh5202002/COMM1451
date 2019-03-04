/**
 * 
 */
package a01040431_lab08a;

/**
 * @author choya
 *
 */
public class SalariedEmployee extends Employee{

	private static final double yearlysSalary = 40000;
	private int weeksPerYear;
	
	/**
	 * default constructor 
	 */
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Overloaded constructor
	 * @param name the name to set
	 * @param weeksPerYear the weeksPerYear to set
	 */
	public SalariedEmployee(String name, int weeksPerYear) {
		super(name);
		// TODO Auto-generated constructor stub
		setWeeksPerYear(weeksPerYear);
	}

	/**
	 * @return the weeksPerYear as int  
	 */
	public int getWeeksPerYear() {
		return weeksPerYear;
	}

	/**
	 * @param weeksPerYear the weeksPerYear to set
	 */
	public void setWeeksPerYear(int WeeksPerYear) {
		this.weeksPerYear = WeeksPerYear;
	}

	/**
	 * @return the yearlyssalary as double
	 */
	public static double getYearlyssalary() {
		return yearlysSalary;
	}


	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SalariedEmployee [weeksPerYear=" + weeksPerYear + ", toString()=" + super.toString() + "]";
	}

	/**
	 * implementation of abstract method calculateMonthlyEarnings
	 */
	public double calculateMonthlyEarnings() {
		return (yearlysSalary / weeksPerYear) * (52/12);
	};
	
	

}
