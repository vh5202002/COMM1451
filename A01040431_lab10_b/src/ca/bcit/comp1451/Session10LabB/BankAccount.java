package ca.bcit.comp1451.Session10LabB;

public class BankAccount {
	
	private String name;
	private double balance;
	/**
	 * @param name
	 * @param balance
	 */
	public BankAccount(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if(name != null && name.length() > 1) {
			this.name = name;
		}else {
			this.name = "unknown";
		}
		
	}
	/**
	 * @return the balance
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
	 * 
	 * @param amount
	 */
	public void deposit(double amount) throws NegativeAmountException{
		if(amount > 0) {
			balance += amount;
		}else {
			throw new NegativeAmountException("The amount is negative!");
		}
	}
	
	/**
	 * 
	 * @param amount
	 */
	public void withdraw(double amount) throws InsufficientFundException{
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}else {
			throw new InsufficientFundException("The amount is negative/ amount is bigger then balance");
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankAccount [name=" + name + ", balance=" + balance + "]";
	}

	
}
