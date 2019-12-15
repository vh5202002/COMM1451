import java.util.ArrayList;

public class Driver {
	
	public static void main(String[] args) {
		
		ArrayList<Electronics> list = new ArrayList<Electronics>();
		
		Cellphone c = new Cellphone("Bell", 1300, 12, 3);
		Computer cp = new Computer("Apple", 1500, 12, 456, 17);
		Laptop l = new Laptop("Coco", 300, 6, 256, 4, 28);
		
		list.add(c);
		list.add(cp);
		list.add(l);
		
		for(Electronics e : list) {
			System.out.println(e);
		}
		System.out.println();
		c.increasePrice(0.5);
		cp.increasePrice(0.5);
		l.increasePrice(0.5);
		
		for(Electronics e2 : list) {
			System.out.println(e2);
		}
	}

}
