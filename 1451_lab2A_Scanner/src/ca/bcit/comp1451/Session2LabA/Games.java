package ca.bcit.comp1451.Session2LabA;

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
	
	public static void main(String[] args) {
		Games g = new Games();
		g.textParser();
	}

}
