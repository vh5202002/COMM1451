/**
 * 
 */
package ca.bcit.comp1451.session05LabB;

/**
 * @author choya
 *
 */
public class Car extends Vehicle{

	private int horsePower;
	
	/**
	 * constructor 
	 * @param yearManufactured
	 * @param make
	 * @param model
	 * @param horsePower
	 */
	public Car(int yearManufactured, String make, String model, int horsePower) {
		super(yearManufactured, make, model);
		
		setHorsePower(horsePower);
	}

	/**
	 * @return the horsePower as a int
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		if(horsePower > 0) {
			this.horsePower = horsePower;
		}
	}
	
	
	/**
	 * diplayDetails
	 */
	public void diplayDetails() {
		System.out.println("Make: " + getMake() );
		System.out.println("Model: " + getModel() );
		System.out.println("Year of Manufactured: " + getYearManufactured() );
		System.out.println("Horse Power: " + horsePower);
	}
	
	
	

}
