
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

	
	
}
