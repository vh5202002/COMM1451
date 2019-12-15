package ca.bcit.comp1451.lab07a;

public class Cellphone extends Electronics{
	
	private double batteryLifeTime;

	/**
	 * constructor 
	 * @param brand
	 * @param price
	 * @param warrantyInMonths
	 */
	public Cellphone(String brand, double price, int warrantyInMonths, double batteryLifeTime) {
		super(brand, price, warrantyInMonths);
		setBatteryLifeTime(batteryLifeTime);
	}

	/**
	 * @return the batteryLifeTime as a double 
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
		return "Cell Phone: " + super.toString() + ", Battery Life: " + batteryLifeTime + "Hr" ;
	}

	/* (non-Javadoc)
	 * @see ca.bcit.comp1451.lab07a.Electronics#increasePrice(double)
	 */
	@Override
	public double increasePrice(double percentage) {
		
		if(percentage > 0.0 ) {
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
