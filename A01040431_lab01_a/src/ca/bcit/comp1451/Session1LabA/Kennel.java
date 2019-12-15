package ca.bcit.comp1451.Session1LabA;

import java.util.ArrayList;
import java.util.Iterator;
public class Kennel {

	private ArrayList<Dog> list;
	
	/**
	 * constructors
	 */
	public Kennel() {
		list = new ArrayList<Dog>();
	}
	
	/**
	 * add the dogs
	 * @param theDog
	 */
	public void addDog(Dog theDog) {
		if(theDog != null) {
			list.add(theDog);
		}
	}
	
	/**
	 * display all the dogs
	 */
	public void displayDogs() {
		for(Dog d : list) {
			d.dispalyDetails();
		}
	}
	
	
	
	/**
	 * remove the dogs
	 * @param name
	 */
	public void adopt(String name) {
		Iterator <Dog> it = list.iterator();
		
		while(it.hasNext()) {
				Dog d = it.next();
				
				if(d.getName().equalsIgnoreCase(name)) {
					System.out.println("Remove the dog: " + d.getName() + " " + d.getBreed() +
						" " + d.getAgeInYear());
					it.remove();
					break;
				}else {
					throw new IllegalArgumentException
					("there is no dog with the given name in this collection.");
					//System.out.println("there is no dog with the given name in this collection."); 
							
				}
	
		}
	}
	
	
}
