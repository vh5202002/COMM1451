/**
 * 
 */
package com.a01040431.animalHotel;
import java.util.ArrayList;

import com.a01040431.animal.Animal;

/**
 * @author choya
 *
 */
public class AnimalHotel {
	private ArrayList<Animal> hotal;

	/**
	 * Constructor for ArrayList
	 */
	public AnimalHotel() {
		// TODO Auto-generated constructor stub
		hotal = new ArrayList<Animal>();
	}
	
	/**
	 * add the animal to arrayList
	 * @param animal 
	 */
	public void addAnimal(Animal animal) {
		hotal.add(animal);
	}
	
	/**
	 * show all the animal
	 */
	public void show() {
		
		for(Animal animal : hotal) {
			animal.display();
			System.out.println();
		}
	}
	
}
