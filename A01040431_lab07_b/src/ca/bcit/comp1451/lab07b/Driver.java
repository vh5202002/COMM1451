/**
 * 
 */
package ca.bcit.comp1451.lab07b;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author choya
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SalesEmployee s1 = new SalesEmployee("Nana", 28, 500);
		SalesEmployee s2 = new SalesEmployee("Coco", 4, 4500);
		
		HourlyEmployee h1 = new HourlyEmployee("Weber", 88, 30);
		HourlyEmployee h2 = new HourlyEmployee("Choya", 120, 35);
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(s1);
		emp.add(s2);
		emp.add(h1);
		emp.add(h2);
		
		for(Employee e : emp) {
			System.out.println(e);
		}
		
		System.out.println("Iterate Throuth put list: ");
		Iterator iterate = emp.iterator();
		while (iterate.hasNext()) {
			System.out.println(iterate.next() + " ");
		}
		
	}

}
