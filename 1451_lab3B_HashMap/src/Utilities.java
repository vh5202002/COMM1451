import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Utilities {

	private HashMap<String, Integer> list;
	
	public Utilities() {
		list = new HashMap<String, Integer>();
	}
	
	public void populateHashMap() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a text");
		while(input.hasNext()) {
			int count = 1;
			String word = input.next();
			if(list.containsKey(word)) {
				count = list.get(word);
				count ++ ;
			}
			list.put(word, count);
		}
	}
	
	public void displayCollection() {
		System.out.println(" the words in the list are: ");
		Set<Map.Entry<String, Integer>> wordSet = list.entrySet();
		for(Map.Entry<String, Integer> pair : wordSet) {
			System.out.println("the word " + pair.getKey() 
			+ " appeared " + pair.getValue() + " times ");
		}
	}
	public void getCount(String word) {
		if(list.containsKey(word)) {
			System.out.println("this word appeared: " + list.get(word));
		}
	}
	
	public void displayTheWord(int number) {
		Set<String> words = list.keySet();
		if(words.size() >0) {
			for(String s : words) {
				if(list.get(s)  == number) {
					System.out.println("the words : " + s + " appeared " + number 
							+ "of the times");
				}
			}
		}
	}
	
	public void removeWord(String word) {
		if(word != null && list.containsKey(word)) {
			System.out.println("removing : (" + word + ")");
			list.remove(word);
		}
	}
	

}
