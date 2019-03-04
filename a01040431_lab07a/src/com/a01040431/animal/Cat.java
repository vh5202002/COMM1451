/**
 * 
 */
package com.a01040431.animal;

/**
 * @author choya
 *
 */
public class Cat extends Animal{
	private boolean hunt;
	

	/**
	 *  Default Constructor 
	 */
	public Cat() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * Constructor for animal 
	 * @param breed  The breed of this animal.
	 * @param kilo   The kilo of this animal.
	 * @param hunt   The hunt of this animal.
	 */
	public Cat(String breed, double kilo, boolean hunt) {
		super(breed, kilo);
		// TODO Auto-generated constructor stub
		setHunt(hunt);
	}

	

	/**
	 * @return the hunt as a boolean
	 */
	public boolean getHunt() {
		return hunt;
	}



	/**
	 * @param hunt the hunt to set
	 */
	public void setHunt(boolean hunt) {
		this.hunt = hunt;
	}

	/**
	 * display cat 
	 */
	public void display() {
		
		boolean user = true;
		
		if(user == hunt) {
			System.out.println("This is a hunter!");
		}else {
			System.out.println("This is one lazy cat!");
		}
		
		super.display();
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cat [hunt=" + hunt + ", toString()=" + super.toString() + "]";
	}
	
	
	

	
	

}
