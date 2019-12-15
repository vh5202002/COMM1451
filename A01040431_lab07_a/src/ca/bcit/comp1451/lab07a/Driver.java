package ca.bcit.comp1451.lab07a;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<Electronics> ect = new ArrayList<Electronics>();
		
		Cellphone c = new Cellphone("Nokia", 300, 18, 3.5);
		Computer cp = new Computer("Dell D2100", 1000, 24, 2500, 512);
		Laptop l = new Laptop("HP N5170", 1500, 24, 1500, 256, 15);

		ect.add(c);
		ect.add(cp);
		ect.add(l);
		
		for(Electronics e : ect) {
			System.out.println(e);
		}
		System.out.println();
		
		c.increasePrice(0.5);
		cp.increasePrice(0.5);
		l.increasePrice(0.5);
		
		for(Electronics e1 : ect) {
			System.out.println(e1);
		}
		
		
		
	}

}
