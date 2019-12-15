package ca.bcit.comp1451.lab07a;

public class Laptop extends Computer{
	
	private double screenSize;

	/**
	 * constructor 
	 * @param brand
	 * @param price
	 * @param warrantyInMonths
	 * @param cpuSpeed
	 * @param memorySizeInGB
	 */
	public Laptop(String brand, double price, int warrantyInMonths, int cpuSpeed, int memorySizeInGB,
			double screenSize) {
		super(brand, price, warrantyInMonths, cpuSpeed, memorySizeInGB);
		// TODO Auto-generated constructor stub
		setScreenSize(screenSize);
	}

	/**
	 * @return the screenSize as a double 
	 */
	public double getScreenSize() {
		return screenSize;
	}

	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(double screenSize) {
		if(screenSize > 0) {
			this.screenSize = screenSize;
		}else {
			throw new IllegalArgumentException("");
		}
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Laptop: " + super.toString() + ", Screen Size:" + screenSize + "''";
	}

	
	
	

}
