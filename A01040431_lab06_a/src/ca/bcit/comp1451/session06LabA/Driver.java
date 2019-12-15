package ca.bcit.comp1451.session06LabA;

public class Driver {

	public static void main(String[] args) {
		
		
		PersonCollection p = new PersonCollection();
		Employee e1 = new Employee("Choya", 29, 44, 4);
		Employee e2 = new Employee("Coco", 18, 30, 2);
		Student s1 = new Student("Vivi", 20, true, 59.7);
		Student s2 = new Student("Lala", 33, false, 87.2);
		
		p.loadCollection(e1, s1);
		p.loadCollection(e2, s2);
		
		p.displayAllDetails();
		
		p.testEquality();

	}
}
