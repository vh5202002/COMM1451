
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
