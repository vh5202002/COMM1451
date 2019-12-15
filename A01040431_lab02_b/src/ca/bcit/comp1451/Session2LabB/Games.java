/**
 * 
 */
package ca.bcit.comp1451.Session2LabB;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author choya
 *
 */
public class Games {
	
	private Scanner input;
	private ArrayList<String> wList;
	private ArrayList<Integer> iList;
	private ArrayList<Double> dList;
	//private Die die;
	
	/**
	 * constructor 
	 */
	public Games() {
		input =  new Scanner(System.in);
		wList = new ArrayList<String>();
		iList = new ArrayList<Integer>();
		dList = new ArrayList<Double>();
	}
	
	/**
	 * text Parser
	 */
	public void textParser() {
		
	
		System.out.println("Enter a line of text: ");
		
		while(input.hasNext()) {
			if(input.hasNextInt()) {
				int number = input.nextInt();	
				iList.add(number);

				
		}else if(input.hasNextDouble()) {
			double dNumber = input.nextDouble();
			dList.add(dNumber);
			
			}else {
				String name = input.next();
				wList.add(name);
			}
		}
		
		System.out.println("number of words: " + wList.size());
		System.out.println(wList);
		System.out.println("number of numbers: " + iList.size());
		System.out.println(iList);
		System.out.println("number of doubles: " + dList.size());
		System.out.println(dList);
	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		Games g = new Games();
		
	//	g.textParser();
		g.playChicago();
		
	}
	
	
	/**
	 * playChicago
	 */
	public void playChicago() {
		Die d1 = new Die();
		Die d2 = new Die();
		int playerPoints = 0;
		
		for(int i = 2; i < 13 ; i ++) {
			System.out.println();
			System.out.println("Enter to put FIRST throw ");
			int firstThrow = d1.roll();
			input.nextLine();
			
			System.out.println("Enter to put SECOND throw ");
			int secondThrow = d2.roll();
			input.nextLine();
			
			int result = firstThrow + secondThrow;
			
			System.out.println("Round number " + i);
			System.out.println("First die value was " + firstThrow);
			System.out.println("Second die value was " + secondThrow);
			
			if(result == i) {
					System.out.println("Points earned 1 point");
					playerPoints++;	
			}
		}
		System.out.println("\nGAME OVER!");
		System.out.println("Player earned " + playerPoints + " point(s)");
		}
	}
	
	
