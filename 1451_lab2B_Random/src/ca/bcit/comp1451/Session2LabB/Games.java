package ca.bcit.comp1451.Session2LabB;

import java.util.ArrayList;
import java.util.Scanner;

public class Games {
	
	private Scanner input;
	private ArrayList<String> strList;
	private ArrayList<Integer> intList;
	private ArrayList<Double> douList;
	
	public Games() {
		input = new Scanner(System.in);
		strList = new ArrayList<String>();
		intList = new ArrayList<Integer>();
		douList = new ArrayList<Double>();
	}
	
	public void textParser() {
		System.out.println("Enter a line of text: ");
		
		while(input.hasNext()) {
			
			if(input.hasNextInt()) {
				int iInput = input.nextInt();
				intList.add(iInput);
			}else if(input.hasNextDouble()) {
				double dInput = input.nextDouble();
				douList.add(dInput);
			}else {
				String sInput = input.next();
				strList.add(sInput);
			}
		}
		
		System.out.println("number of words " + strList.size());
		System.out.println(strList);
		System.out.println("number of numbers " + intList.size());
		System.out.println(douList);
		System.out.println("number of doubles " + douList.size());
		System.out.println(intList);
	}
	
	public void playChicago() {
		Die d1 = new Die();
		Die d2 = new Die();
		int point = 0;
		for(int i = 2; i < 13 ; i++) {
			
			System.out.println("first");
			int firstTime = d1.roll();
			input.nextLine();
			
			System.out.println("second");
			int secondTime = d2.roll();
			input.nextLine();
			
			int total =  firstTime + secondTime;
			
			System.out.println("Round number " + i);
			System.out.println("First die value was " + firstTime);
			System.out.println("Second die value was " + secondTime);
			if(total == i) {
				System.out.println("point earned 1");
				point ++;
			}
			
		}
		System.out.println();
		System.out.println("Game over!");
		System.out.println("Total earned : " + point + " points");

	}
	
	public static void main(String[] args) {
		Games g = new Games();
//		g.textParser();
		g.playChicago();
	}

}
