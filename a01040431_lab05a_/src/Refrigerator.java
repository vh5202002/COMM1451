/**
 * 
 */

/**
 * @author A01042699
 *
 */
public class Refrigerator extends HomeAppliances {

	private double maxColdnessDegrees;

	/**
	 * 
	 */
	public Refrigerator() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param brand
	 * @param serialNumber
	 * @param height
	 * @param depth
	 * @param width
	 * @param canSetnGet
	 */
	public Refrigerator(String brand, String serialNumber, double height, double depth, double width, boolean canSetnGet, int maxColdnessDegrees) {

		super(brand, serialNumber, height, width, width, canSetnGet);
		// TODO Auto-generated constructor stub
		setMaxColdnessDegrees(maxColdnessDegrees);
	}

	public double volumeCapacity() {
		double volume = (getHeight() * getWidth() * getDepth());
		System.out.println("This is the total volume: " + volume + "cm3");
		return volume;
	}

	/**
	 * @return the maxColdnessDegrees
	 */
	public double getMaxColdnessDegrees() {
		return maxColdnessDegrees;
	}

	/**
	 * @param maxColdnessDegrees
	 *            the maxColdnessDegrees to set
	 */
	public void setMaxColdnessDegrees(double maxColdnessDegrees) {
		if (maxColdnessDegrees <= 0) {
			this.maxColdnessDegrees = maxColdnessDegrees;
		}
	}

}
