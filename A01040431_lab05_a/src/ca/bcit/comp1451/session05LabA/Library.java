package ca.bcit.comp1451.session05LabA;

import java.util.ArrayList;

public class Library {

	private ArrayList<ReadingMaterial> list;
	
	/**
	 * constructor
	 */
	public Library() {
		list = new ArrayList<ReadingMaterial>();
	}
	
	/**
	 * loadLibrary
	 * @param added
	 */
	public void loadLibrary(TextBook textBook, Novel novel, Magazine magazine) {
		
		if(textBook != null) {
			list.add(textBook);
			
		}if(novel != null) {
			
			list.add(novel);
			
		}if(magazine != null) {
			list.add(magazine);
		}
			
	
	}
	
	/**
	 * displayAllMaterialDetails
	 */
	public void displayAllMaterialDetails() {
		for(ReadingMaterial r : list) {
			if(r instanceof TextBook) {
				TextBook t = (TextBook) r;
				t.diplayDetails();
			}
			else if (r instanceof Novel){
				Novel n = (Novel) r;
				n.diplayDetails();		
			}
			else if(r instanceof Magazine) {
				Magazine m = (Magazine) r;
				m.diplayDetails();
			}
			
		}
	}
	
	/**
	 * displaysMagazinesDetails
	 */
	public void displaysMagazinesDetails() {
		for(ReadingMaterial r : list) {
			if(r instanceof Magazine ) {
				Magazine m = (Magazine) r;
				m.diplayDetails();
			}
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Library l = new Library();
		
		l.loadLibrary(new TextBook("choya",190, "box", "ccc" ," hodw"), new Novel("rebook",19823, "eihide", "xxxx", "dhief") , 
				new Magazine("hifehi", 1990 , "dheidei", 3894 ));
		l.displaysMagazinesDetails();
		l.displayAllMaterialDetails();
	}
	
	
}
