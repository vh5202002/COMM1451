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
	
	
	
}
