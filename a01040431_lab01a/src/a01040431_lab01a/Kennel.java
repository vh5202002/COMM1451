/**
 * 
 */
package a01040431_lab01a;

import java.util.*;

/**
 * @author a01040431
 *
 */
public class Kennel {

	private ArrayList<Dog> dogs;

	/**
	 * 
	 */
	public Kennel() {

		dogs = new ArrayList<Dog>();

	}
	
	/**
	 * 
	 * @param aDog
	 */
	public void addDog(Dog aDog) {

		if (aDog != null) {
			dogs.add(aDog);
		}

	}
	
	/**
	 * 
	 */
	public void displayDogs() {

		for (Dog aDog : dogs)

			System.out.println(aDog.getName());

	}

	/**
	 * 
	 * @return
	 */
	public Dog getRandomDog() {
		
		Random rand = new Random();
		int selectedIndex = rand.nextInt(dogs.size());
		
		return dogs.remove(selectedIndex);
	}
	
	/**
	 * 
	 */
	public void adopt() {
		System.out.println(getRandomDog().getName() + "  adobted!!");
	}
	
	
}
