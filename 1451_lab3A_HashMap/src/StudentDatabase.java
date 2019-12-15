import java.util.HashMap;
import java.util.Set;

public class StudentDatabase {

	private HashMap<String, int[]> quizMarks;
	public static final int NUM_QUIZZES	= 10;
	public static final int MIN_GRADE	= 0;
	public static final int MAX_GRADE	= 100;
	
	public StudentDatabase() {
		quizMarks = new HashMap<String, int[]>();
	}
	
	private String formatName(String name) {
		String format = "";
		if(name != null && !name.isEmpty()) {
			String[] nameParts = name.toUpperCase().split(" ");
			for(int i = 0 ; i < nameParts.length ; i ++) {
				format = format + nameParts[i].substring(0,1)+
						nameParts[i].substring(1).toLowerCase() + " "; 
			}
		}
		return format.trim();
	}
	
	public void addStudent(String studentName) {
		if(studentName != null) {
			quizMarks.put(formatName(studentName), new int[NUM_QUIZZES]);
		}else {
			System.out.println("Can not find the name");
		}
	}
	
	public void displayQuizzes(String student) {
		if(student != null && !student.isEmpty()) {
			if(quizMarks.containsKey(student)) {
				System.out.println("Display quizzes of the: " + student);
				for(int i = 0; i < NUM_QUIZZES ; i++) {
					System.out.println(quizMarks.get(formatName(student))[i]);
				}
			}
		}else {
			System.out.println("we dont have this student");
		}
	}
	
	public void changeQuizMark(String studentName, int whichQuiz, int newMark) {
		if(studentName != null && !studentName.isEmpty()) {
			
			if(quizMarks.containsKey(studentName)) {
				if(whichQuiz >= 0 && whichQuiz <= 10) {
					if(newMark >= MIN_GRADE && newMark <= MAX_GRADE) {
						quizMarks.get(formatName(studentName))[whichQuiz] = newMark;
				}else {
					System.out.println("XXXX");
				}
			}
				
		}
	}
	}
	
	public void showQuizMarks() {
		Set<String> mySet = quizMarks.keySet();
		if(quizMarks != null && !quizMarks.isEmpty()) {
			for(String key : mySet) {
				System.out.println("quiz marks for: " + key);
				
				for(int i = 0; i < NUM_QUIZZES ; i++) {
					System.out.print(quizMarks.get(key)[i] + " ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		StudentDatabase s = new StudentDatabase();
		s.addStudent("choya");
		s.addStudent("coco");
		
		s.displayQuizzes("Choya");
		s.changeQuizMark("Coco", 3, 100);
		s.showQuizMarks();
		
	}
}
	
