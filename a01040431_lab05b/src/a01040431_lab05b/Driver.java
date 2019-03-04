package a01040431_lab05b;

public class Driver {

	public static void main(String[] args) {
		
			
		Student student1 = new Student("Choya","Liang","1234@gamil.com","a01040431");
		Student student2 = new Student("Weber","Co","1234@gamil.com","a01040431");
		Student student3 = new Student("Vivan","Liang","1234@gamil.com","a01040431");
		
		student1.addCourse("Math", 100);
		student1.addCourse("History", 55.3);
		student2.addCourse("Math", 20.50);
		student2.addCourse("History", 99.63);
		student3.addCourse("Math", 100);
		student3.addCourse("History", 22.34);
		
		Instructor instructor1 = new Instructor("gcdu","ewfefw","12345","6544444",44.66);
		Instructor instructor2 = new Instructor("fewefw","32de","12345","6544444",100);
		Instructor instructor3 = new Instructor("cwevew","yyyy","12345","6544444",120.59);
		
		Database database = new Database();
		database.addReferences(student1);
		database.addReferences(student2);
		database.addReferences(student3);
		database.addReferences(instructor1);
		database.addReferences(instructor2);
		database.addReferences(instructor3);
		
		System.out.println("-- Calculate Student average --");
		System.out.println("Student 1's average: " + student1.CalculatesAverage());
		
		database.displaysAll();
		
	}

}
