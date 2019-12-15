import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Student extends Identify{

	private HashMap<String, Double> list;

	/**
	 * @param firstName
	 * @param lastName
	 * @param emailAdd
	 * @param id
	 */
	public Student(String firstName, String lastName, String emailAdd, String id) {
		super(firstName, lastName, emailAdd, id);
		list = new HashMap<String, Double>();
	}
	
	public void addcourse(String course, double grade) {
		if(course != null) {
			if(grade > 0 && grade <= 100) {
				list.put(course, grade);
			}
		}
	}
	
	public void calculatesAverage() {
		double total = 0;
		for(String grade : list.keySet()) {
			total += list.get(grade);
		}
		if(!list.isEmpty()) {
			System.out.println("Total marks: " + total / list.size()); 
		}
	}
	
	public void dispay() {
		Set<Map.Entry<String, Double>> wordSet = list.entrySet();
		for(Map.Entry<String, Double> pair : wordSet) {
			System.out.println("Course: " + pair.getKey() + "Mark: " + pair.getValue());
		}
	}
	

}
