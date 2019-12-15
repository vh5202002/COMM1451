package ca.bcit.comp1451.Session2LabB;

import java.util.Random;

public class Die {
	
	private int faceValue;
	private Random random;
	
	public Die() {
		random = new Random();
		roll();
	}

	/**
	 * @return the faceValue
	 */
	public int getFaceValue() {
		return faceValue;
	}

	/**
	 * @return the random
	 */
	public Random getRandom() {
		return random;
	}
	
	public int roll() {
		int num = random.nextInt(6)+1;
		return faceValue = num;
		
	}
	
	

}
