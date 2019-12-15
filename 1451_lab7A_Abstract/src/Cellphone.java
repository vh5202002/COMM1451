
public class Cellphone extends Electronics{

	private double batteryLifeTime;

	/**
	 * @param brand
	 * @param price
	 * @param warrantyInMonths
	 */
	public Cellphone(String brand, double price, int warrantyInMonths, double batteryLifeTime) {
		super(brand, price, warrantyInMonths);
		
		this.batteryLifeTime = batteryLifeTime;
		
	}

	/**
	 * @return the batteryLifeTime
	 */
	public double getBatteryLifeTime() {
		return batteryLifeTime;
	}

	/**
	 * @param batteryLifeTime the batteryLifeTime to set
	 */
	public void setBatteryLifeTime(double batteryLifeTime) {
		if(batteryLifeTime > 0) {
			this.batteryLifeTime = batteryLifeTime;
		}else {
			throw new IllegalArgumentException("");
		}
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cellphone [toString()=" + super.toString() + ", batteryLifeTime=" + batteryLifeTime + "]";
	}

	/* (non-Javadoc)
	 * @see Electronics#increasePrice(double)
	 */
	@Override
	public double increasePrice(double percentage) {
		if(percentage > 0) {
			double price =  getPrice();
			price += price * percentage;
			setPrice(price);
			int warranty = getWarrantyInMonths();
			warranty += 6;
			setWarrantyInMonths(warranty);
		}
		return getPrice() + getWarrantyInMonths();
	}
	
	
	


}
