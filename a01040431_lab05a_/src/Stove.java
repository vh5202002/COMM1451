/**
 * 
 */

/**
 * @author A01042699
 *
 */
public class Stove extends HomeAppliances {
	private int numHeating;

	/**
	 * 
	 */
	public Stove() {
		super();
	}

	/**
	 * @param brand
	 * @param serialNumber
	 * @param height
	 * @param depth
	 * @param width
	 * @param canSetnGet
	 */
	public Stove(String brand, String serialNumber, double height, double depth, double width, boolean canSetnGet,
			int numHeating) {
		super(brand, serialNumber, height, depth, width, canSetnGet);
		// TODO Auto-generated constructor stub
		setNumHeating(numHeating);
	}

	/**
	 * @return the numHeating
	 */
	public int getNumHeating() {
		System.out.println(numHeating);
		return numHeating;
	}

	/**
	 * @param numHeating
	 *            the numHeating to set
	 */
	public void setNumHeating(int numHeating) {
		if (numHeating > 0) {
			this.numHeating = numHeating;
		}
	}

}
