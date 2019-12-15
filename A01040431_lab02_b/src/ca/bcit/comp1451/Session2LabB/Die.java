/**
 * 
 */
package ca.bcit.comp1451.Session2LabB;

import java.util.Random;

/**
 * @author choya
 *
 */
public class Die {
	
	private int faceValue;
	private Random random;
	

	/**
	 * constructor
	 */
	public Die() {
		
		 random = new Random();
		 roll(); // call the roll() method 
	}
	
	/**
	 * 
	 * @return
	 */
	public int getFaceValue() {
		return faceValue;
	}

	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	
	/**
	 * @param random the random to set
	 */
	public void setRandom(Random random) {
		this.random = random;
	}
	
	/**
	 * @return the random
	 */
	public Random getRandom() {
		return random;
	}


	/**
	 * 
	 * @return
	 */
	public int roll() {
		
		int num = random.nextInt(6)+1;
		return faceValue = num;
	}

	
	
	

}
