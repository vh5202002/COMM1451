
public class Person {

	private String name;
	private int ageInYear;
	/**
	 * @param name
	 * @param ageInYear
	 */
	public Person(String name, int ageInYear) {
		super();
		this.name = name;
		this.ageInYear = ageInYear;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the ageInYear
	 */
	public int getAgeInYear() {
		return ageInYear;
	}
	/**
	 * @param ageInYear the ageInYear to set
	 */
	public void setAgeInYear(int ageInYear) {
		this.ageInYear = ageInYear;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Name: " + name + ", and age is " + ageInYear + "years";
	}

}
