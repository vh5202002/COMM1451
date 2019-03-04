/**
 * 
 */

/**
 * @author A01042699
 *
 */
public class HomeAppliances {
	private String brand;
	private String serialNumber;
	private double height;
	private double depth;
	private double width;
	private boolean canSetnGet;

	/**
	 * Default constructor
	 */
	public HomeAppliances() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param brand
	 *            to set brand field
	 * @param serialNumber
	 *            to set serial number field
	 * @param height
	 *            to set height field
	 * @param depth
	 *            to set depth field
	 * @param width
	 *            to set width field
	 * @param canSetnGet
	 *            to set canSetnGet field
	 */

	public HomeAppliances(String brand, String serialNumber, double height, double depth, double width,
			boolean canSetnGet) {
		setBrand(brand);
		setSerialNumber(serialNumber);
		setHeight(height);
		setDepth(depth);
		setWidth(width);
		setCanSetnGet(canSetnGet);
		// TODO Auto-generated constructor stub
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if (!brand.isEmpty() && brand != null) {
			this.brand = brand;
		}
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		if (!serialNumber.isEmpty() && serialNumber != null) {
			this.serialNumber = serialNumber;
		}
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height >= 0) {
			this.height = height;
		}
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		if (depth >= 0) {
			this.depth = depth;
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width >= 0) {
			this.width = width;
		}
	}

	public boolean isCanSetnGet() {
		return canSetnGet;
	}

	public void setCanSetnGet(boolean canSetnGet) {
		this.canSetnGet = canSetnGet;
	}

}
