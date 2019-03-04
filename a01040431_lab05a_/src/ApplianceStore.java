/**
 * 
 */
import java.util.ArrayList;
/**
 * @author A01042699
 *
 */
public class ApplianceStore {

	private ArrayList<HomeAppliances> appliances;
	
	/**
	 * 
	 */
	public ApplianceStore() {
		super();
		appliances = new ArrayList<HomeAppliances>();
	}
	
	
	public void addAppliances(HomeAppliances homeAppl) {
		if(homeAppl != null) {
		appliances.add(homeAppl);
		}
	}
	
	public int numAppliances() {
		System.out.println(appliances.size());
		return appliances.size();
	}
	
	public void details() {
		for(HomeAppliances HomeAppl: appliances) {
			System.out.println("Brand: " + HomeAppl.getBrand() + ", Serial Number: " + HomeAppl.getSerialNumber());
		}
	}
}
