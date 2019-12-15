import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmailInfo {

	private HashMap<String, String> addressBook;
	
	public EmailInfo() {
		addressBook = new HashMap<String, String>();
	}
	
	private String formatName(String name) {
		String format = "";
		
		if(name != null) {
			format = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		}
		return format;
	}

	/**
	 * 
	 * @param name
	 * @param email
	 */
	public void addFriend(String name, String email) {
		if(name != null && !name.isEmpty()) {
			if(email != null && !email.isEmpty()) {
				addressBook.put(formatName(name), email);
			}
		}
	}
	
	/**
	 * 
	 * @param name
	 */
	public void removeFriend(String name) {
		if(name != null && addressBook.containsKey(name)) {
			name = formatName(name);
			addressBook.remove(formatName(name));
		}
	}
	
	public String getAddress(String name) {
		if(name != null) {
			name = formatName(name);
			if(addressBook.containsKey(name) != false) {
				return addressBook.get(formatName(name));
			}
		}
		return null;
	}
	
	public void findFriends(String email) {
		
	}
	
	public void listAll() {
		for(String name : addressBook.keySet()) {
			System.out.println("name: " + name);
			System.out.println("email: " + addressBook.get(name));
		}
	}
	
}
