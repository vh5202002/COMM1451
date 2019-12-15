import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<AudioMaterail> list = new ArrayList<AudioMaterail>();
		
	    Movie movie = new Movie("man in black", 120d, "peter", 15);
	    Album album = new Album("fly", 50d, 9, "james");
	    AudioBook audioBook = new AudioBook("hello world", 50d, 120, "24");
	    
	    list.add(movie);
	    list.add(album);
	    list.add(audioBook);
	    
	    Collections.sort(list);
	    for(AudioMaterail a : list) {
	    	System.out.println(a);
	    }
	}
}
