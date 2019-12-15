package ca.bcit.comp1451.Session10LabB;

import java.util.Scanner;

public class Bank {

	private Scanner scanner;
	private BankAccount account;

	/**
	 * Bank
	 * @param account
	 */
	public Bank(BankAccount account) {
		scanner = new Scanner(System.in);
		this.account = account;
	}
	
	/**
	 * processTransaction
	 */
	public void processTransaction() {
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("-----------------------------");
			System.out.println("Choose the transaction type: ");
			System.out.println("1 deposit");
			System.out.println("2 withdraw");
			System.out.println("3 display information");
			System.out.println("-----------------------------");
			
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				choice = 1;
				System.out.println("Please enter the amount: ");
				int amount = scanner.nextInt();
				try {
					account.deposit(amount);
				}catch(NegativeAmountException e){
					System.out.println(e.getMessage());
				}catch(Exception m) {
					System.out.println(m.getMessage());
				}
				break;
			case 2:
				choice = 2;
				System.out.println("Please enter the amount: ");
				int amount2 = scanner.nextInt();
				try {
					account.withdraw(amount2);
				}catch(InsufficientFundException e){
					System.out.println(e.getMessage());
				}catch(Exception m) {
					System.out.println(m.getMessage());
				}
				break;
			case 3:
				choice = 3;
				System.out.println(account);
				break;
	
			}
//			scanner.close();
		}
	}


	/**
	 * 
	 * @param args
	 * @throws NegativeAmountException
	 */
	public static void main(String[] args) {
		
		Bank b = new Bank( new BankAccount("Choya", 2000));
		b.processTransaction();
	}

}
