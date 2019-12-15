import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		SalesEmployee s1 = new SalesEmployee("Cho", 4, 1.3);
		SalesEmployee s2 = new SalesEmployee("Vivi", 7, 4);
		HourlyEmployee h1 = new HourlyEmployee("Chen", 44, 15);
		HourlyEmployee h2 = new HourlyEmployee("Co", 33, 22);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(s1);
		list.add(s2);
		list.add(h1);
		list.add(h2);
		
		for(Employee e : list) {
			System.out.println(e);
		}
		
		
	}

}
