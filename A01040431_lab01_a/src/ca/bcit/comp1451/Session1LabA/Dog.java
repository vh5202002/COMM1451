package ca.bcit.comp1451.Session1LabA;

public class Dog {
	private String name;
	private String breed;
	private int ageInYear;
	


	/**
	 * @param name a string to set the name of the field
	 * @param breed a string to set the breed of the field
	 * @param ageInYear a int to set the ageInYear of the field
	 */
	public Dog(String name, String breed, int ageInYear) {
		super();
		setName(name);
		setBreed(breed);
		setAgeInYear(ageInYear);
	}


	/**
	 * @return the name as a string
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
			throw new IllegalArgumentException("there is no name");
		}
	}


	/**
	 * @return the breed as a string
	 */
	public String getBreed() {
		return breed;
	}


	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		if(breed != null && !breed.isEmpty()) {
			this.breed = breed;
		}else {
			throw new IllegalArgumentException("there is no breed");
		}
	}


	/**
	 * @return the ageInYear as a int
	 */
	public int getAgeInYear() {
		return ageInYear;
	}


	/**
	 * @param ageInYear the ageInYear to set
	 */
	public void setAgeInYear(int ageInYear) {
		if(ageInYear >= 0) {
			this.ageInYear = ageInYear;
		}else {
			throw new IllegalArgumentException(" age should be bigger than 0 year");
		}

	}
	
	/**
	 * display the details
	 */
	public void dispalyDetails() {
		System.out.println("the dog name is " + name);
		System.out.println("the dog breed is " + breed);
		System.out.println("the dog age is " + ageInYear);
	}
	
	
	
	

}
