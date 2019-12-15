package ca.bcit.comp1451.session04LabB;

public class BankAccount {
	
	private String name;
	private double balance;
	
	/**
	 * constructors
	 * @param name
	 * @param balance
	 */
	public BankAccount(String name, double balance) {
		super();
		setName(name);
		setBalance(balance);
	}
	
	/**
	 * constructor 
	 * @param name
	 */
	public BankAccount(String name) {
		balance = 0;
	}


	/**
	 * @return the name as a String
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}else {
			this.name = "unknown";
		}
	}


	/**
	 * @return the balance as a double
	 */
	public double getBalance() {
		return balance;
	}


	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		if(balance > 0) {
			this.balance = balance;
		}
	}
	
	/**
	 * deposit
	 * @param amount
	 */
	public void deposit(double amount) {
		if(amount > 0 ) {
			this.balance += amount;
		}
	}
	
	/**
	 * withdraw
	 * @param amount
	 */
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			this.balance -= amount;
		}
	}
	
	/**
	 * applyInterest
	 */
	public void applyInterest() {
		
		this.balance += (balance * 0.05);
		
	}
	
	
	
	
	
	
}
