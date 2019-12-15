package ca.bcit.comp1451.session06LabA;

public class Student extends Person{
	private boolean isFullTimeStudent;
	private double gpa;
	
	/**
	 * constructor 
	 * @param name
	 * @param ageInyears
	 */
	public Student(String name, int ageInyears, boolean isFullTimeStudent, double gpa ) {
		super(name, ageInyears);
		// TODO Auto-generated constructor stub
		setIsFullTimeStudent(isFullTimeStudent);
		setGpa(gpa);
	}

	/**
	 * @return the isFullTimeStudent as a boolean
	 */
	public boolean isFullTimeStudent() {
		return isFullTimeStudent;
	}

	/**
	 * @param isFullTimeStudent the isFullTimeStudent to set
	 */
	public void setIsFullTimeStudent(boolean isFullTimeStudent) {
		this.isFullTimeStudent = isFullTimeStudent;
	}

	/**
	 * @return the gpa as a double 
	 */
	public double getGpa() {
		return gpa;
	}

	/**
	 * @param gpa the gpa to set
	 */
	public void setGpa(double gpa) {
		if(gpa >= 0 && gpa <= 100) {
			this.gpa = gpa;
		}else {
			throw new IllegalArgumentException("");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if(isFullTimeStudent == true) {
			return "This Student’s name is " + super.toString() + " year old"  +
					" This student is a full time student" + " with the GPA of "  + gpa;
		}else {
			return "This Student’s name is " + super.toString() + " year old"  +
					" This student is a part time student" + " with the GPA of "  + gpa;
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
