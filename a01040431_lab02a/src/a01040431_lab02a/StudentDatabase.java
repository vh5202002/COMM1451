/**
 * 
 */
package a01040431_lab02a;

/**
 * @author choya
 *
 */
import java.util.HashMap;

public class StudentDatabase {

	private HashMap<String, int[]> quizMarks;
	
	public static final int NUM_QUIZZES = 10;
    public static final int MIN_GRADE = 0;
    public static final int MAX_GRADE = 100;
	/**
	 * 
	 */
	public StudentDatabase() {
		
		quizMarks = new HashMap<String, int[]>();
	}
	
	private String formatName(String name) {
		String text = null;
		if(name != null && !name.isEmpty()) {
			text = name.substring(0,1).toUpperCase() 
					+ name.substring(1).toLowerCase();
		}
		return text; 
	}
	
	
	public void addStudent(String studentName) {
			if(studentName != null && studentName.length() >0) {
				quizMarks.put(formatName(studentName),new int[10] );
			}
		
	}
	
	public int[] getQuizzes(String student) {
		if(student != null) {
			
			return quizMarks.get(formatName(student));
		}
			return null;
		}

	
	public void changeQuizMark(String studentName, 
			int whichQuiz, int newMark) {
		if(quizMarks.containsKey(formatName(studentName))) {
			if(whichQuiz >=0 && whichQuiz <= NUM_QUIZZES && newMark >= MIN_GRADE && newMark <= MAX_GRADE) {
			quizMarks.get(formatName(studentName))[whichQuiz] = newMark;
		}
		}
		
	}
	
	public void showQuizMarks() {
		
		for(String key  : quizMarks.keySet()) {
			
			System.out.println("Quiz marks for: " + key);
			for(int i = 0; i < NUM_QUIZZES; i++ ) {
				System.out.println( quizMarks.get(key)[i]);
			}
		}
		
	}
}
