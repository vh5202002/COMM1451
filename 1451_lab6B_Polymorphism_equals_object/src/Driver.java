
public class Driver {
	
	public static void main(String[] args) {
		PersonCollection p = new PersonCollection();
		p.loadCollection(new Employee("Choya", 1989, 80,
				4), new Student("Celien", 1985, true,
						77.5));
		p.displayAllDetails();
		p.testEquality();
	}
}
