
public class Employee extends Person{
	
	private double hourlyRate;
	private int workingHoursPerWeek;
	/**
	 * @param name
	 * @param ageInYear
	 */
	public Employee(String name, int ageInYear, double hourlyRate,
			int workingHoursPerWeek) {
		super(name, ageInYear);
		setHourlyRate(hourlyRate);
		setWorkingHoursPerWeek(workingHoursPerWeek);
	}
	/**
	 * @return the hourlyRate
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}
	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	/**
	 * @return the workingHoursPerWeek
	 */
	public int getWorkingHoursPerWeek() {
		return workingHoursPerWeek;
	}
	/**
	 * @param workingHoursPerWeek the workingHoursPerWeek to set
	 */
	public void setWorkingHoursPerWeek(int workingHoursPerWeek) {
		this.workingHoursPerWeek = workingHoursPerWeek;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(workingHoursPerWeek >= 40) {
			return "Employee " + super.toString() + "This employee is a full time employee ";
		}else {
			return "Employee " + super.toString() + "This employee is a part time employee ";
		}
	
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(hourlyRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(hourlyRate) != Double.doubleToLongBits(other.hourlyRate))
			return false;
		return true;
	}
	
	
}
