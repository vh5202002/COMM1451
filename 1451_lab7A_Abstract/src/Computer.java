
public class Computer extends Electronics{

	private int cpuSpeed;
	private int memorySizeInGB;
	/**
	 * @param brand
	 * @param price
	 * @param warrantyInMonths
	 * @param cpuSpeed
	 * @param memorySizeInGB
	 */
	public Computer(String brand, double price, int warrantyInMonths, int cpuSpeed, int memorySizeInGB) {
		super(brand, price, warrantyInMonths);
		this.cpuSpeed = cpuSpeed;
		this.memorySizeInGB = memorySizeInGB;
	}
	/**
	 * @return the cpuSpeed
	 */
	public int getCpuSpeed() {
		return cpuSpeed;
	}
	/**
	 * @param cpuSpeed the cpuSpeed to set
	 */
	public void setCpuSpeed(int cpuSpeed) {
		this.cpuSpeed = cpuSpeed;
	}
	/**
	 * @return the memorySizeInGB
	 */
	public int getMemorySizeInGB() {
		return memorySizeInGB;
	}
	/**
	 * @param memorySizeInGB the memorySizeInGB to set
	 */
	public void setMemorySizeInGB(int memorySizeInGB) {
		this.memorySizeInGB = memorySizeInGB;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Computer [toString()=" + super.toString() + ", cpuSpeed=" + cpuSpeed + ", memorySizeInGB="
				+ memorySizeInGB + "]";
	}
	/* (non-Javadoc)
	 * @see Electronics#increasePrice(double)
	 */
	@Override
	public double increasePrice(double percentage) {
		if(percentage > 0) {
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
