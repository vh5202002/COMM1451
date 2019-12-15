
public class Boat extends Vehicle{
	
	private boolean isMotorized;

	/**
	 * @param year
	 * @param mark
	 * @param model
	 */
	public Boat(int year, String mark, String model, boolean isMotorized) {
		super(year, mark, model);
		// TODO Auto-generated constructor stub
		this.isMotorized = isMotorized;
	}

	/**
	 * @return the isMotorized
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
	
	public void displayDetails() {
		System.out.println("make: " + getMark());
		System.out.println("model: " + getModel());
		System.out.println("year manufactured: " + getYear());
		System.out.println("isMotorized? : " + isMotorized);
	}
	
}
