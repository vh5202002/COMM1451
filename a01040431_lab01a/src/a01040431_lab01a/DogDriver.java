/**
 * 
 */
package a01040431_lab01a;

/**
 * @author a01040431 Chiao Yu
 *
 */
public class DogDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Dog dog_1 = new Dog("Choya","GSD",1);
		Dog dog_2 = new Dog("Weber","DSH",3);
		Dog dog_3 = new Dog("Lucky","GOD",4);
		
		Kennel kennel = new Kennel();
		
		kennel.addDog(dog_1);
		kennel.addDog(dog_2);
		kennel.addDog(dog_3);
		
		kennel.displayDogs();
		kennel.adopt();
		
		kennel.displayDogs();
	}

}
