package ca.bcit.comp1451.session06LabA;

public class Employee extends Person{

	private double hourlyRate;
	private int numberOfWorkingHoursPerWeek;
	
	/**
	 * constructor 
	 * @param name
	 * @param ageInyears
	 */
	public Employee(String name, int ageInyears, double hourlyRate, int numberOfWorkingHoursPerWee) {
		super(name, ageInyears);
		// TODO Auto-generated constructor stub
		setHourlyRate(hourlyRate);
		setNumberOfWorkingHoursPerWeek(numberOfWorkingHoursPerWee);
	}
	
	/**
	 * @return the hourlyRate as a double
	 */
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	/**
	 * @param hourlyRate the hourlyRate to set
	 */
	public void setHourlyRate(double hourlyRate) {
		if(hourlyRate >0 && hourlyRate <= 80) {
			this.hourlyRate = hourlyRate;
		}
		
	}
	/**
	 * @return the numberOfWorkingHoursPerWeek as a int
	 */
	public int getNumberOfWorkingHoursPerWeek() {
		return numberOfWorkingHoursPerWeek;
	}
	
	/**
	 * @param numberOfWorkingHoursPerWeek the numberOfWorkingHoursPerWeek to set
	 */
	public void setNumberOfWorkingHoursPerWeek(int numberOfWorkingHoursPerWeek){
		if(numberOfWorkingHoursPerWeek >0 && numberOfWorkingHoursPerWeek <= 80) {
			this.numberOfWorkingHoursPerWeek = numberOfWorkingHoursPerWeek;
		}else {
			throw new IllegalArgumentException("");
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(getHourlyRate() >= 40) {
			return "This Employee’s name is " + super.toString() + " This employee is a full time employee" ;
		}else {
			return "This Employee’s name is " + super.toString() + " This employee is a part time employee";
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
