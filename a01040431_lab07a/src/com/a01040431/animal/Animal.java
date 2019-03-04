package com.a01040431.animal;

public class Animal {
	private String breed;
	private double kilo;

	/**
	 * Default Constructor 
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor for objects of class Animal.
	 * @param breed The breed of this Animal.
	 * @param kilo  The kilo of this Animal.
	 */
	public Animal(String breed, double kilo) {
		super();
		setBreed(breed);
		setKilo(kilo);
	}



	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		if(breed != null) {
			this.breed = breed;
		}

	}

	/**
	 * @param kilo the kilo to set 
	 */
	public void setKilo(double kilo) {
		if(kilo > 0.0) {
			this.kilo = kilo;
		}
	}
	
	/**
	 * @return the breed as a String
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @return the kilo as a double 
	 */
	public double getKilo() {
		return kilo;
	}
	
	/**
	 * display Animal
	 */
	public void display() {
		
		System.out.println("This is a " + breed + " weighing " + kilo + " kilos.");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Animal [breed=" + breed + ", kilo=" + kilo + "]";
	}

	
	

}
