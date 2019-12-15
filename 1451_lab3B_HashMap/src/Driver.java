
public class Driver {

	public static void main(String[] args) {
		Utilities u = new Utilities();
		u.populateHashMap();
		u.displayCollection();
		u.getCount("bcit");
		u.displayTheWord(3);
		u.removeWord("choya");
		u.displayCollection();
	}
}
