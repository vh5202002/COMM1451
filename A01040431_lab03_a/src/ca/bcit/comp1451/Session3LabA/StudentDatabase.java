/**
 * 
 */
package ca.bcit.comp1451.Session3LabA;
import java.util.HashMap;
import java.util.Set;
/**
 * @author choya
 *
 */
public class StudentDatabase {
	private HashMap<String, int[]> quizMarks;
	
	public static final int NUM_QUIZZES	= 10;
	public static final int MIN_GRADE	= 0;
	public static final int MAX_GRADE	= 100;
	
	
	/**
	 * constructor 
	 */
	public StudentDatabase() {
		quizMarks = new HashMap<String, int[]>();
	}

	/**
	 * formatName
	 * @param name
	 * @return
	 */
	private String formatName(String name) {
		
		String text = null;
		if(name != null && !name.isEmpty()) {
			text = name.substring(0,1).toUpperCase()
					+ name.substring(1).toLowerCase();
		}
		return text;
	}
	
	/**
	 * addStudent
	 * @param studentName
	 */
	public void addStudent(String studentName) {
		if(studentName != null && !studentName.isEmpty()) {
			quizMarks.put(formatName(studentName), new int[NUM_QUIZZES]);
		}
	}
	
	/**
	 * displayQuizzes
	 * @param studnet
	 */
	public void displayQuizzes(String studnet) {
		
		studnet = formatName(studnet);
		
		if(studnet != null && !studnet.isEmpty()) {
			if(quizMarks.containsKey(studnet)) {
				System.out.println("Display Quizzes of : " + studnet);
				for(int i = 0 ; i < NUM_QUIZZES ; i++) {
					System.out.print(quizMarks.get(studnet)[i]+ " ");
				}
			}
		}else {
			System.out.println("We do not have this student!!");
		}
		
	}
	
	/**
	 * changeQuizMarks
	 * @param studentName
	 * @param whichQuiz
	 * @param newMark
	 */
	public void changeQuizMarks(String studentName, int whichQuiz, int newMark){
		
		if(studentName != null) {
			
			studentName = formatName(studentName);
			
			if(!quizMarks.containsKey(studentName)) {
				System.out.println("Student is not there");
			}else if(whichQuiz < 0 || whichQuiz > NUM_QUIZZES) {
				System.out.println("There is no this quiz");
			}else if(newMark < MIN_GRADE || newMark > MAX_GRADE) {
				System.out.println("error message");
			}else {
				quizMarks.get(formatName(studentName))[whichQuiz] = newMark;
			}
		}
		
	}
	
	/**
	 * showQuizMarks
	 */
	public void showQuizMarks() {
		Set<String> mySet = quizMarks.keySet();
		
		if(quizMarks != null && !quizMarks.isEmpty()) {
			for(String oneKey : mySet) {
				System.out.println();
				System.out.println("Quiz marks for: " + oneKey);
				
				for(int i = 0 ; i < NUM_QUIZZES ; i++) {
					System.out.print(quizMarks.get(oneKey)[i] + " ");
				}
			}
		}else {
			System.out.println("There is no student");
		}
		
	}
	
	/**
	 * main method 
	 * @param args
	 */
	public static void main(String[] args) {
		
		StudentDatabase s = new StudentDatabase();
		
		s.addStudent("Choya");
		s.addStudent("Vivi");
		s.addStudent("Coco");
	
		s.displayQuizzes("choya");
		s.changeQuizMarks("vivi", 3, 100);
		s.showQuizMarks();
		
	}
	
	
	

}
