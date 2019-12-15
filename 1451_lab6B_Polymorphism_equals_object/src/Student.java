
public class Student extends Person{
	
	private boolean isFullTime;
	private double gpa;
	/**
	 * @param name
	 * @param ageInYear
	 */
	public Student(String name, int ageInYear, boolean isFullTime,
			double gpa) {
		super(name, ageInYear);
		this.isFullTime = isFullTime;
		setGpa(gpa);
	}
	/**
	 * @return the isFullTime
	 */
	public boolean isFullTime() {
		return isFullTime;
	}
	/**
	 * @param isFullTime the isFullTime to set
	 */
	public void setFullTime(boolean isFullTime) {
		this.isFullTime = isFullTime;
	}
	/**
	 * @return the gpa
	 */
	public double getGpa() {
		return gpa;
	}
	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(isFullTime == true) {
			return "Student " + super.toString() + "This student is a full time student with the gpa of " + gpa ;
		}else {
			return "Student " + super.toString() + "This student is a part time student with the gpa of " + gpa ;
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
		temp = Double.doubleToLongBits(gpa);
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
		Student other = (Student) obj;
		if (Double.doubleToLongBits(gpa) != Double.doubleToLongBits(other.gpa))
			return false;
		return true;
	}

	
	
	
}
