package a01040431_lab02b;

public class EmaillnfoDriver {

	public static void main(String[] args) {
		
		EmailInfo addressBook = new EmailInfo();
		
		// Declaring the names of the friends
		String[] names = {"choya", "webber", "vivian", "pig", "kiki"};
		
		
		// Adding the friends to the EmailInfo class
		for(String name : names) {
			addressBook.addFriend(name, name + "@testmail.com");
		}
		
		// Printing all the friends and there details to the terminal
		System.out.println();
		addressBook.listAll();
		
		// Removing a friend from the database
		System.out.println();
		addressBook.removeFriend("pig");
		addressBook.listAll();
		
		// Looking for a friend by there name
		System.out.println();
		System.out.println(addressBook.getAddress("choya"));
		
		// Looking for friend by there email address
		System.out.println();
		addressBook.findFriends("vivian@testmail.com");

		
		
	}

}
