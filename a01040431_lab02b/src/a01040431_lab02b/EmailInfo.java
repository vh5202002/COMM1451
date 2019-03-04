/**
 * 
 */
package a01040431_lab02b;

import java.util.HashMap;
/**
 * @author choya
 *
 */
public class EmailInfo {
	
	private HashMap<String, String> addressBook;

	/**
	 * The default constructor initialize the HashMap used to store email addresses
	 */
	public EmailInfo() {
		
		addressBook = new HashMap<String, String>();
	}
	
	/**
	 * formatName
	 * @param name  Used to pass in the name needed to be formated.
	 * @return Names formatted in camel case.
	 */
	private String formatName(String name) {
		String fName = null;
		if(name != null && !name.isEmpty()) {
			fName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
		}
		return fName;
	}
	
	/**
	 * Add a friend to the address book. 
	 * @param name Formats the name into camel case and uses it as the key for the provided email 
	 * @param email Adds the provided string to the email address with the name as the key.
	 */
	public void addFriend(String name, String email) {
		
		if(name != null && !name.isEmpty()) {
			if(email != null && !email.isEmpty()) {
				name = formatName(name);
				addressBook.put(formatName(name), email.toLowerCase());
			}
		}
	}
	
	/**
	 * 
	 * @param name The name of the user you would like to remove from the address book.
	 */
	public void removeFriend(String name) {
		if(name != null && !name.isEmpty()) {
			name = formatName(name);
			if(addressBook.containsKey(name) != false) {
				addressBook.remove(formatName(name));
			}
		}	
	}
	
	/**
	 * Return an email address based on friend’s name.
	 * @param name The name of the friend you wish to find the email address for.
	 * @return The email address of the friend passed in String format.
	 */
	public String getAddress(String name) {
			if(name != null && !name.isEmpty()) {
				name = formatName(name);
				if(addressBook.containsKey(name) != false) {
					return addressBook.get(formatName(name));
				}
			}
			return null;
		}
	
	
	/**
	 * Find and display friends based on their email address.
	 * @param email The email address of the friend you are looking for.
	 */
	public void findFriends(String email) {
		if(email != null && email.trim().length() > 0) {
			email = email.toLowerCase();
			if(this.addressBook.containsValue(email)) {
				System.out.println("List all contact with requested email address: \"" + email + "\"");
				for(String name : this.addressBook.keySet()) {
					if(this.addressBook.get(name).equals(email)) {
						System.out.println("Name: " + name);
						System.out.println("Email: " + email + "\r\n");
					}
				}
			} else {
				System.out.println("The email " + email + " has not yet been added.");
			}
		} else {
			System.out.println("You must provide a valid string for the email.");
		}
	}
	/**
	 * List all contacts and their email addresses 
	 */
	public void listAll() {
		
		if(addressBook != null) {
			System.out.println("Friends List: ");
			for(String name : addressBook.keySet()) {
				System.out.println("Name: " + name);
				System.out.println("Email: " + addressBook.get(name));
			}
		}
	}
}
