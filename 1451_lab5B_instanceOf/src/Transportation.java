import java.util.ArrayList;

public class Transportation {

	private ArrayList<Vehicle> list;
	
	public Transportation() {
		list = new ArrayList<Vehicle>();
	}
	
	public void loadCollection(Car car, Boat boat, Airplane airplane) {
		if(car != null) {
			list.add(car);
		}if(boat != null) {
			list.add(boat);
		}if(airplane != null) {
			list.add(airplane);
		}
	}
	
	public void displayAllDetails() {
		for(Vehicle v : list) {
			if(v instanceof Car) {
				Car c = (Car) v;
				c.displayDetails();
			}else if(v instanceof Boat) {
				Boat b = (Boat) v;
				b.displayDetails();
			}else if(v instanceof Airplane) {
				Airplane a = (Airplane) v;
				a.displayDetails();
			}
		}
	}
	
	public void displaysAirplanesDetails() {
		for(Vehicle v : list) {
			if( v instanceof Airplane) {
				Airplane a = (Airplane) v;
				a.displayDetails();
			}
		}
	}
	
	public static void main(String[] args) {
		Transportation t = new Transportation();
		t.loadCollection(new Car(2019, "SOgood", "Vifiam", 2993), 
				new Boat(2011, "CHi", "tb1033", true), 
				new Airplane(1988, "Fkkk", "yogood", 77));
		
		t.displayAllDetails();
		t.displaysAirplanesDetails();
	}
	
}
