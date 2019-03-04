/**
 * 
 */
package a01040431_lab02a;

/**
 * @author choya
 *
 */
public class StudentDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StudentDatabase driver = new StudentDatabase();
		
		driver.addStudent("choya");
		driver.addStudent("weber");
		driver.addStudent("arturo");
		driver.addStudent("vivian");
		
		driver.changeQuizMark("choya",3,100);
		driver.changeQuizMark("arturo",2,100);
		
		driver.showQuizMarks();

	}

}
