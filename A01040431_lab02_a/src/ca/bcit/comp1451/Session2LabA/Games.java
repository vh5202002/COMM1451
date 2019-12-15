/**
 * 
 */
package ca.bcit.comp1451.Session2LabA;
import java.util.Scanner;
import java.util.Random;
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
		
		g.textParser();
	}
	
	
	
}
