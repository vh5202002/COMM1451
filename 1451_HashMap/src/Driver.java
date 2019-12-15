
public class Driver {

	public static void main(String[] args)  {
		
		Student s = new Student("Chi", "Liagn", "a010102@gamil", "a01010402");
		s.addcourse("Math", 100);
		s.addcourse("English", 50);
		Instructor i = new Instructor("Vivi", "Chen", "989812@gnaim.com", "a010103", 40);
		s.calculatesAverage();
		s.dispay();
		
		Database d = new Database();
		d.addPeople(i);
		d.addPeople(s);
		
		d.displayAll();
	
	}

}
