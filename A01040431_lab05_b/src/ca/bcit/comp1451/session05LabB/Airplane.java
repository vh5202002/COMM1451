package ca.bcit.comp1451.session05LabB;

public class Airplane extends Vehicle{
	
	private int maximumHeightInFeet;
	
	/**
	 * constructor
	 * @param yearManufactured
	 * @param make
	 * @param model
	 * @param maximumHeightInFeet
	 */
	public Airplane(int yearManufactured, String make, String model, int maximumHeightInFeet) {
		super(yearManufactured, make, model);
		
		setMaximumHeightInFeet(maximumHeightInFeet);
	}

	/**
	 * @return the maximumHeightInFeet as a int
	 */
	public int getMaximumHeightInFeet() {
		return maximumHeightInFeet;
	}

	/**
	 * @param maximumHeightInFeet the maximumHeightInFeet to set
	 */
	public void setMaximumHeightInFeet(int maximumHeightInFeet) {
		if(maximumHeightInFeet > 0) {
			this.maximumHeightInFeet = maximumHeightInFeet;
		}
	}
	
	/**
	 * diplayDetails
	 */
	public void diplayDetails() {
		System.out.println("Make: " + getMake() );
		System.out.println("Model: " + getModel() );
		System.out.println("Year of Manufactured: " + getYearManufactured() );
		System.out.println("Maximum height in feet: " + maximumHeightInFeet);
	}
	

}
