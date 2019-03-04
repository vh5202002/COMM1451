package com.a01040431.diver;

import com.a01040431.animal.Animal;
import com.a01040431.animal.Cat;
import com.a01040431.animal.Dog;
import com.a01040431.animalHotel.AnimalHotel;

public class Diver {

	public static void main(String[] args) {
		
		AnimalHotel qq = new AnimalHotel();
		// TODO Auto-generated method stub
		Cat c1 = new Cat("hdue",1.2,false);
		Cat c2 = new Cat("Choya",1.2,true);
		
		Dog d1 = new Dog("Wber",2.2,false);
		Dog d2 = new Dog("hieh",2.2,true);
		
		qq.addAnimal(c1);
		qq.addAnimal(c2);
		qq.addAnimal(d1);
		qq.addAnimal(d2);
		
		qq.show();
		
		
	}

}
