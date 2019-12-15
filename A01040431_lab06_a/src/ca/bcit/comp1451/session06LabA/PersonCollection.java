package ca.bcit.comp1451.session06LabA;

import java.util.ArrayList;

public class PersonCollection {
	private ArrayList<Person> list;

	/**
	 * constructor 
	 */
	public PersonCollection() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<Person>();
	}

	/**
	 * loadCollection
	 * @param employee
	 * @param student
	 */
	public void loadCollection(Employee employee, Student student) {
		if(employee != null) {
			list.add(employee);
		}
		if(student != null) {
			list.add(student);
		}
	}
	
	/**
	 * displayAllDetails
	 */
	public void displayAllDetails() {
		
		for(Person p : list) {
			System.out.println(p);
		}
	}
	
	/**
	 * testEquality
	 */
	public void testEquality() {
		Student s1 = new Student("Steven", 30, true, 77.7);
		Student s2 = new Student("Steven", 20, false,77.7);
		Employee e1 = new Employee("Gigi", 20, 40, 2);
		Employee e2 = new Employee("Gigi", 50, 20, 4);
		
		System.out.println();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("s1.equals(s2) " +  s1.equals(s2) );
		
		System.out.println();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("e1.equals(e2) " + e1.equals(e2));
	}
	
	
	
}
