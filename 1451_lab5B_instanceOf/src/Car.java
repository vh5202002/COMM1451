
public class Car extends Vehicle{

	private int horsePower;

	/**
	 * @param year
	 * @param mark
	 * @param model
	 */
	public Car(int year, String mark, String model, int horsePower) {
		super(year, mark, model);
		// TODO Auto-generated constructor stub
		setHorsePower(horsePower);
	}

	/**
	 * @return the horsePower
	 */
	public int getHorsePower() {
		return horsePower;
	}

	/**
	 * @param horsePower the horsePower to set
	 */
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	
	public void displayDetails() {
		System.out.println("make: " + getMark());
		System.out.println("model: " + getModel());
		System.out.println("year manufactured: " + getYear());
		System.out.println("horse power: " + horsePower);
	}
	
}
