package ca.bcit.comp1451.lab08;

import java.util.ArrayList;
import java.util.Collections;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<AudioMaterial> a = new ArrayList<AudioMaterial>();
	       Movie movie = new Movie("man in black", 120d, "peter", 15);
	        Album album = new Album("fly", 50d, 9, "james");
	        AudioBook audioBook = new AudioBook("hello world", 50d, 120, "24");
	        a.add(movie);
	        a.add(album);
	        a.add(audioBook);
	        Collections.sort(a);
	        a.forEach(am -> System.out.println(am));

	}

}
