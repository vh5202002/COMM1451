/**
 * 
 */

/**
 * @author A01042699
 *
 */
public class DriverAppliances {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplianceStore appStore = new ApplianceStore();
		
		HomeAppliances hA1 = new Refrigerator("brand", "A-123", 10, 10, 2, true, -30);
		HomeAppliances hA2 = new Refrigerator("sdfg", "B-123", 10, 10, 2, true, -60);
		HomeAppliances hA3 = new Stove("oru", "C-123", 10, 10, 2, true, 2);
		HomeAppliances hA4 = new Stove("art", "D-123", 10, 10, 2, true, 6);
		
		appStore.addAppliances(hA1);
		appStore.addAppliances(hA2);
		appStore.addAppliances(hA3);
		appStore.addAppliances(hA4);
		
		appStore.numAppliances();
		appStore.details();
	}

}
