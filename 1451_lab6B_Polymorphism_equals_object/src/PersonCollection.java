import java.util.ArrayList;

public class PersonCollection {
	
	private ArrayList<Person> list;
	
	public PersonCollection() {
		list = new ArrayList<Person>();
	}
	
	public void loadCollection(Employee employee, Student student){
		if(employee != null) {
			list.add(employee);
		}if(student != null) {
			list.add(student);
		}
		
	}
	
	public void displayAllDetails() {
		for(Person p : list) {
			System.out.println(p);
		}
	}
	

	public void testEquality() {
		Student s1 = new Student("Cho", 29, true, 5.5);
		Student s2 = new Student("Cho", 18, true, 5.5);
		System.out.println("s1 gpa is equals s2 = "+ s1.equals(s2));
		
		Employee e1 = new Employee("Web", 33, 30, 4);
		Employee e2 = new Employee("Web", 33, 20, 4);
		System.out.println("e1 hourly rate is equals e2 = " + e1.equals(e2));
	}
}
