/**
 * 
 */
package a01040431_lab05b;
import java.util.HashMap;

/**
 * @author choya
 *
 */
public class Student extends UserInformation{
	private HashMap<String, Double> grades;

	/**
	 * Default Constructor 
	 */
	public Student() {}


	/**
	 * @param firstName to set firstName field
	 * @param lastName to set lastName field
	 * @param emailAddress to set emailAddress field
	 * @param bcitId to set bcitId field
	 */
	public Student(String firstName, String lastName, String emailAddress,
			String bcitId) {
		super(firstName, lastName, emailAddress, bcitId);
		
		grades = new HashMap<String, Double>();
	}

	/**
	 * 
	 * @param course is the course of the student
	 * @param grade is the grade of the course for the student
	 */
	public void addCourse(String course, double grade) {
		
		if(course != null && course.length() >0 ) {
			if(grade >0 && grade <= 100) {
				grades.put(course, grade);
			}else {
				System.out.println("That is not a valid grade. ");
			}
		}else {
			System.out.println("That si not a valid course name!");
		}
		
	}
	
	/**
	 * Calculates the Average of the grade
	 * @return the average of the student's grade as a double.
	 */
	public double CalculatesAverage() {
		double total = 0;
		for(String course : grades.keySet()) {
			total += grades.get(course);
		}
		if(!grades.isEmpty()) {
			return total / grades.size();
		
		}else {
			return 0.0;
		}
		
	}
	
	
}
