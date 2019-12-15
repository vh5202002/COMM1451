import java.util.ArrayList;

public class Library {
	
	private ArrayList<ReadingMaterial> list;
	
	public Library() {
		list = new ArrayList<ReadingMaterial>();
	}
	
	public void loadLibrary(TextBook textBook, Novel novel,
			Magazine magazine) {
		if(textBook != null) {
			list.add(textBook);
		}if(novel != null) {
			list.add(novel);	
		}if(magazine != null) {
			list.add(magazine);
		}
	}
	
	public void displayAllMaterialDetails() {
		for(ReadingMaterial r : list) {
			if(r instanceof TextBook) {
				TextBook t = (TextBook) r;
				t.displayDetails();
			}else if(r instanceof Novel) {
				Novel n = (Novel) r;
				n.displayDetails();
			}else if(r instanceof Magazine) {
				Magazine m = (Magazine) r;
				m.displayDetails();
			}
		}
	}
	
	public void displaysMagazinesDetails() {
		for(ReadingMaterial r : list) {
			if(r instanceof Magazine) {
				Magazine m = (Magazine) r;
				m.displayDetails();
			}
		}
	}
	
	public static void main(String[] args) {
		Library l = new Library();
		l.loadLibrary(new TextBook("Good B", 103, "number2",
				"Cho", "very good"), 
				new Novel("CiIC", 88,"Chen",
						"thoew", "thiehrqw"), 
				new Magazine("Good v", 400, "notbad",
						199));
		l.displaysMagazinesDetails();
		l.displayAllMaterialDetails();
	}
	
}
