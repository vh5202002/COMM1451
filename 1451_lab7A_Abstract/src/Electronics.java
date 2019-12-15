
public abstract class Electronics {

	private String brand;
	private double price;
	private int warrantyInMonths;
	/**
	 * @param brand
	 * @param price
	 * @param warrantyInMonths
	 */
	public Electronics(String brand, double price, int warrantyInMonths) {
		super();
		this.brand = brand;
		this.price = price;
		this.warrantyInMonths = warrantyInMonths;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		if(brand != null && !brand.isEmpty()) {
			this.brand = brand;
		}else {
			throw new IllegalArgumentException("Please enter brand");
		}
		
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}else {
			throw new IllegalArgumentException("");
		}
		
	}
	/**
	 * @return the warrantyInMonths
	 */
	public int getWarrantyInMonths() {
		return warrantyInMonths;
	}
	/**
	 * @param warrantyInMonths the warrantyInMonths to set
	 */
	public void setWarrantyInMonths(int warrantyInMonths) {
		if(warrantyInMonths > 0 ) {
			this.warrantyInMonths = warrantyInMonths;
		}else {
			throw new IllegalArgumentException("");
		}
		
	}
	
	public abstract double increasePrice (double percentage);
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Electronics [brand=" + brand + ", price=" + price + ", warrantyInMonths=" + warrantyInMonths + "]";
	}
	
	
	
	
	
}
