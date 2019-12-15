package ca.bcit.comp1451.session06LabA;

public class Person {
	private String name;
	private int ageInyears;
	
	/**
	 * constructor 
	 * @param name
	 * @param ageInyears
	 */
	public Person(String name, int ageInyears) {
		super();
		setName(name);
		setAgeInyears(ageInyears);
	}

	/**
	 * @return the name as a String
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}else {
			throw new IllegalArgumentException("");
		}
		
	}

	/**
	 * @return the ageInyears as a int
	 */
	public int getAgeInyears() {
		return ageInyears;
	}

	/**
	 * @param ageInyears the ageInyears to set
	 */
	public void setAgeInyears(int ageInyears) {
		if(ageInyears >0  && ageInyears <= 130) {
			this.ageInyears = ageInyears;
		}else {
			throw new IllegalArgumentException("");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return   name + ", and age is " + ageInyears ;
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
