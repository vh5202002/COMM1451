package ca.bcit.comp1451.Session1LabA;

public class Dog {
	
	private String name;
	private String breed;
	private int ageInYear;
	/**
	 * @param name
	 * @param breed
	 * @param ageInYear
	 */
	public Dog(String name, String breed, int ageInYear) {
		super();
		this.name = name;
		this.breed = breed;
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
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}else {
			throw new IllegalArgumentException("");
		}
		
	}
	/**
	 * @return the breed
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
			throw new IllegalArgumentException("");
		}
		
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
		if(ageInYear > 0) {
			this.ageInYear = ageInYear;
		}else {
			throw new IllegalArgumentException("");
		}
		
	}
	/**
	 * 
	 */
	public void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Breed: " + breed);
		System.out.println("Age of the dog: " + ageInYear);
	}


}
