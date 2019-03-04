/**
 * 
 */
package com.a01040431.animal;

/**
 * @author choya
 *
 */
public class Dog extends Animal{
	private boolean likesToWalk;

	/**
	 * default constructor
	 */
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructor for animal 
	 * @param breed the breed of this animal.
	 * @param kilo the kilo of this animal.
	 * @param likesToWalk the likesToWalk of this animal
	 */
	public Dog(String breed, double kilo, boolean likesToWalk) {
		super(breed, kilo);
		// TODO Auto-generated constructor stub
		setLikesToWalk(likesToWalk);
	}

	/**
	 * @param likesToWalk the likesToWalk to set
	 */
	public void setLikesToWalk(boolean likesToWalk) {
		
		this.likesToWalk = likesToWalk;
	}
	
	/**
	 * display dog
	 */
	public void display() {
		
		super.display();
		boolean user1 = true;
		
		if(user1 == likesToWalk) {
			System.out.println("This dog likes to walk. ");
		}else {
			System.out.println("This is a lazy dog!");
		}
	}
	
	/**
	 * @return the likesToWalk as a boolean
	 */
	public boolean getLikesToWalk() {
		return likesToWalk;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dog [likesToWalk=" + likesToWalk + ", toString()=" + super.toString() + "]";
	}
	
	



}
