import java.util.ArrayList;

public class Database {

	private ArrayList<Identify> list;
	
	public Database() {
		list = new ArrayList<Identify>();
	}
	
	public void addPeople(Identify i) {
		if(i != null) {
			list.add(i);
		}
	}
	
	public void displayAll() {
		for(Identify i : list) {
			System.out.println(i);
		}
	}
	

}
