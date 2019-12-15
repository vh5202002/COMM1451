
public class Laptop extends Computer{

	private double screenSize;

	/**
	 * @param brand
	 * @param price
	 * @param warrantyInMonths
	 * @param cpuSpeed
	 * @param memorySizeInGB
	 * @param screenSize
	 */
	public Laptop(String brand, double price, int warrantyInMonths, int cpuSpeed, int memorySizeInGB,
			double screenSize) {
		super(brand, price, warrantyInMonths, cpuSpeed, memorySizeInGB);
		this.screenSize = screenSize;
	}

	/**
	 * @return the screenSize
	 */
	public double getScreenSize() {
		return screenSize;
	}

	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Laptop [toString()=" + super.toString() + ", screenSize=" + screenSize + "]";
	}
	


}
