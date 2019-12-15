package ca.bcit.comp1451.session05LabB;

import java.util.ArrayList;

public class Transportation {

	private ArrayList<Vehicle> list;
	
	/**
	 * constructor 
	 */
	public Transportation() {
		list = new ArrayList<Vehicle>();
	}
	
	/**
	 * loadCollection
	 * @param car
	 * @param boat
	 * @param airplane
	 */
	public void loadCollection(Car car, Boat boat, Airplane airplane) {
		
		if(car != null) {
			list.add(car);
		}
		if(boat != null) {
			list.add(boat);
		}
		if(airplane  != null) {
			list.add(airplane);
		}
	}
	
	/**
	 * displayAllDetails
	 */
	public void displayAllDetails() {
		
		for(Vehicle v : list) {
			if(v instanceof Car) {
				Car c = (Car) v;
				c.diplayDetails();
			}
			if(v instanceof Boat) {
				Boat b = (Boat) v;
				b.diplayDetails();
			}
			if(v instanceof Airplane) {
				Airplane a = (Airplane) v;
				a.diplayDetails();
			}
		}
	}
	
	/**
	 * displaysAirplanesDetails
	 */
	public void displaysAirplanesDetails() {
		
		for(Vehicle v : list) {
			if(v instanceof Airplane) {
				Airplane a = (Airplane) v;
				a.diplayDetails();
			}
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Transportation t = new Transportation();
		
		t.loadCollection(new Car(1990, "Choay" , "vivi", 89),
				new Boat(1888, "Weber", "coco", true), 
				new Airplane(1933, "kitti", "contigo", 9999));
		
		t.displaysAirplanesDetails();
		t.displayAllDetails();
		
	}
	
	
	

}
