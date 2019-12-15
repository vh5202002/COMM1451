
public class Airplane extends Vehicle{
	
	private int maximumHeight;

	/**
	 * @param year
	 * @param mark
	 * @param model
	 */
	public Airplane(int year, String mark, String model, int maximumHeight) {
		super(year, mark, model);
		setMaximumHeight(maximumHeight);
	}

	/**
	 * @return the maximumHeight
	 */
	public int getMaximumHeight() {
		return maximumHeight;
	}

	/**
	 * @param maximumHeight the maximumHeight to set
	 */
	public void setMaximumHeight(int maximumHeight) {
		this.maximumHeight = maximumHeight;
	}
	
	public void displayDetails() {
		System.out.println("make: " + getMark());
		System.out.println("model: " + getModel());
		System.out.println("year manufactured: " + getYear());
		System.out.println("maximum height in feet: " + maximumHeight);
	}
	
}
