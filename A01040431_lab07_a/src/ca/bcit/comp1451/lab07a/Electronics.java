package ca.bcit.comp1451.lab07a;

public abstract class Electronics {
	private String brand;
	private double price;
	private int warrantyInMonths;
	
	
	/**
	 * constructor
	 * @param brand
	 * @param price
	 * @param warrantyInMonths
	 */
	public Electronics(String brand, double price, int warrantyInMonths) {
		super();
		setBrand(brand);
		setPrice(price);
		setWarrantyInMonths(warrantyInMonths);
	}


	/**
	 * @return the brand as a string 
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
			throw new IllegalArgumentException("pleace enter the brand");
		}
	}


	/**
	 * @return the price as a double 
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		if(price > 0 ) {
			this.price = price;
		}else {
			throw new IllegalArgumentException("");
		}
	}


	/**
	 * @return the warrantyInMonths as a int
	 */
	public int getWarrantyInMonths() {
		return warrantyInMonths;
	}


	/**
	 * @param warrantyInMonths the warrantyInMonths to set
	 */
	public void setWarrantyInMonths(int warrantyInMonths) {
		if(warrantyInMonths >= 0) {
			this.warrantyInMonths = warrantyInMonths;
		}else {
			throw new IllegalArgumentException("");
		}
	}
	
	/**
	 * abstract
	 * @return
	 */
	public abstract double increasePrice(double percentage);


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Brand: " + brand + " price: " + price + ", Warranty: " + warrantyInMonths + " months";
	}
	
	


}
