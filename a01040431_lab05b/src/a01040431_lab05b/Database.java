/**
 * 
 */
package a01040431_lab05b;
import java.util.ArrayList;

/**
 * @author choya
 *
 */
public class Database {
	
	private ArrayList<UserInformation> userInformations; 

	/**
	 * Constructor
	 */
	public Database() {
		userInformations = new  ArrayList<UserInformation>();
	}
	
	/**
	 * 
	 * @param user to add userInformation
	 */
	public void addReferences(UserInformation userInformation) {
		if(userInformation != null) {
			userInformations.add(userInformation);
		}
	}
	
	/**
	 * displaysAll
	 */
	public void displaysAll() {
		if(!userInformations.isEmpty() && userInformations != null) {
			System.out.println("-- Here is everyone in the database --");
			for(UserInformation userInformation : userInformations) {
				userInformation.displayDetails();
			}
		}

	}
}
