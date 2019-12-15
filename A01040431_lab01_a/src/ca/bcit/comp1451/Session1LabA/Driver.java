package ca.bcit.comp1451.Session1LabA;

public class Driver {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ageInYear = Integer.parseInt(args[2]);
		int ageInYear1 = Integer.parseInt(args[5]);
		Dog d1 = new Dog(args[0],args[1],ageInYear);
		Dog d2 = new Dog(args[3],args[4],ageInYear1);
		
		
		Kennel k = new Kennel();
		k.addDog(d1);
		k.addDog(d2);
		k.displayDogs();
	
	
		k.adopt("fido");
		k.displayDogs();

		
	}

}
