package ca.bcit.comp1451.Session1LabA;

import java.util.ArrayList;
import java.util.Iterator;

public class Kennel {
	
	private ArrayList<Dog> list;
	/**
	 * 
	 */
	public Kennel() {
		list = new ArrayList<Dog>();
	}
	/**
	 * 
	 * @param theDog
	 */
	public void addDog(Dog theDog) {
		if(theDog != null) {
			list.add(theDog);
		}
	}
	/**
	 * 
	 */
	public void displayDogs() {
		for(Dog d : list) {
			System.out.println("name: " + d.getName() + " breed: " + d.getBreed() +
					" age of the dog: " + d.getAgeInYear());
		}
	}
	
	/**
	 * 
	 * @param name
	 */
	public void adopt(String name) {
		Iterator<Dog> theDog = list.iterator();
		while(theDog.hasNext()) {
			Dog d = theDog.next();
			if(d.getName().equals(name)) {
				System.out.println("Remove the dog is: " + d.getName());
				theDog.remove();
				break;
			}else {
				throw new IllegalArgumentException("there has no this dog!");
			}
			
		}
		
		
	}
}
