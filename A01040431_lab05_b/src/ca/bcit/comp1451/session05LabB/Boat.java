package ca.bcit.comp1451.session05LabB;

public class Boat extends Vehicle{

	private boolean isMotorized;
	
	/**
	 * constructor 
	 * @param yearManufactured
	 * @param make
	 * @param model
	 * @param isMotorized
	 */
	public Boat(int yearManufactured, String make, String model, boolean isMotorized) {
		super(yearManufactured, make, model);
		
		this.isMotorized = isMotorized;
	}

	/**
	 * @return the isMotorized as a boolean
	 */
	public boolean isMotorized() {
		return isMotorized;
	}

	/**
	 * @param isMotorized the isMotorized to set
	 */
	public void setMotorized(boolean isMotorized) {
		this.isMotorized = isMotorized;
	}
	
	/**
	 * diplayDetails
	 */
	public void diplayDetails() {
		System.out.println("Make: " + getMake() );
		System.out.println("Model: " + getModel() );
		System.out.println("Year of Manufactured: " + getYearManufactured() );
		System.out.println("is Motorized: " + isMotorized);
	}
	
	
	

}
