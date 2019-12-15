package ca.bcit.comp1451.lab07a;

public class Computer extends Electronics{
	
	private int cpuSpeed;
	private int memorySizeInGB;
	
	/**
	 * constructor 
	 * @param brand
	 * @param price
	 * @param warrantyInMonths
	 */
	public Computer(String brand, double price, int warrantyInMonths, int cpuSpeed,
			int memorySizeInGB) {
		super(brand, price, warrantyInMonths);
		
		setMemorySizeInGB(memorySizeInGB);
		setCpuSpeed(cpuSpeed);
		
	}
	/**
	 * @return the cpuSpeed as a int
	 */
	public int getCpuSpeed() {
		return cpuSpeed;
	}
	/**
	 * @param cpuSpeed the cpuSpeed to set
	 */
	public void setCpuSpeed(int cpuSpeed) {
		if(cpuSpeed > 0) {
			this.cpuSpeed = cpuSpeed;
		}else {
			throw new IllegalArgumentException("");
		}
	
	}
	/**
	 * @return the memorySizeInGB as a int 
	 */
	public int getMemorySizeInGB() {
		return memorySizeInGB;
	}
	
	/**
	 * @param memorySizeInGB the memorySizeInGB to set 
	 */
	public void setMemorySizeInGB(int memorySizeInGB) {
		if(memorySizeInGB > 0) {
			this.memorySizeInGB = memorySizeInGB;
		}else {
			throw new IllegalArgumentException(""); 
		}
		
	}

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Desktop(Computer): " + super.toString() + ", CPU Speed " + cpuSpeed + " MHz" + ", Memory: "
				+ memorySizeInGB + " GB";
	}
	
	/* (non-Javadoc)
	 * @see ca.bcit.comp1451.lab07a.Electronics#increasePrice(double)
	 */
	@Override
	public double increasePrice(double percentage) {
		if(percentage > 0.0 ) {
			double price = getPrice();
			price += price * percentage;
			setPrice(price);
			int warranty = getWarrantyInMonths();
			warranty += 12;
			setWarrantyInMonths(warranty);
		}
		
		return getPrice() + getWarrantyInMonths();
	}
	
	



}
