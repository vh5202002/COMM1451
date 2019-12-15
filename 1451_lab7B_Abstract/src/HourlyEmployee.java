
public class HourlyEmployee extends Employee{

	private int numberOfHours;
	private double payRate;
	/**
	 * @param name
	 * @param numberOfHours
	 * @param payRate
	 */
	public HourlyEmployee(String name, int numberOfHours, double payRate) {
		super(name);
		this.numberOfHours = numberOfHours;
		this.payRate = payRate;
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
		this.numberOfHours = numberOfHours;
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
		this.payRate = payRate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HourlyEmployee [toString()=" + super.toString() + ", numberOfHours=" + numberOfHours + ", payRate="
				+ payRate + "]";
	}
	/* (non-Javadoc)
	 * @see Employee#calcluatePay()
	 */
	@Override
	public double calcluatePay() {
	
		double pay = payRate * numberOfHours;
		return pay;
	}
	


}
