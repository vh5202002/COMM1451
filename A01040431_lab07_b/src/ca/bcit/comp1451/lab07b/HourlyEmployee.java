/**
 * 
 */
package ca.bcit.comp1451.lab07b;

/**
 * @author choya
 *
 */
public class HourlyEmployee extends Employee{
	
	private int numberOfHours;
	private double payRate;
	
	/**
	 * @param name
	 */
	public HourlyEmployee(String name, int numberOfHours, double payRate) {
		super(name);
		setNumberOfHours(numberOfHours);
		setPayRate(payRate);
		
	}

	/**
	 * @return the numberOfHours
	 */
	public int getNumberOfHours() {
		return numberOfHours;
	}

	/**
	 * @param numberOfHours the numberOfHours to set
	 */
	public void setNumberOfHours(int numberOfHours) {
		if(numberOfHours >= 0 ) {
			this.numberOfHours = numberOfHours;
		}else {
			throw new IllegalArgumentException("Please Enter hours ");
		}
	
	}
	

	/**
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		if(payRate >= 0) {
			this.payRate = payRate;
		}else {
			throw new IllegalArgumentException("Enter Pay Rate");
		}
		
	}

	/* (non-Javadoc)
	 * @see ca.bcit.comp1451.lab07b.Employee#calcluatePay()
	 */
	@Override
	public double calcluatePay() {
		double pay = payRate * numberOfHours;
		return pay;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() +"Type of Employees “Hourly” "+ ", Number Of Hours: " + numberOfHours + 
				", Pay Rate: " + payRate +  ", Pay: " + calcluatePay() ;
	}

	


}
