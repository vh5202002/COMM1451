
public class SalesEmployee extends Employee{
	
	private int numberOfSoldUnits;
	private double commission;
	/**
	 * @param name
	 * @param numberOfSoldUnits
	 * @param commission
	 */
	public SalesEmployee(String name, int numberOfSoldUnits, double commission) {
		super(name);
		this.numberOfSoldUnits = numberOfSoldUnits;
		this.commission = commission;
	}
	/**
	 * @return the numberOfSoldUnits
	 */
	public int getNumberOfSoldUnits() {
		return numberOfSoldUnits;
	}
	/**
	 * @param numberOfSoldUnits the numberOfSoldUnits to set
	 */
	public void setNumberOfSoldUnits(int numberOfSoldUnits) {
		if(numberOfSoldUnits > 0) {
			this.numberOfSoldUnits = numberOfSoldUnits;
		}
		
	}
	/**
	 * @return the commission
	 */
	public double getCommission() {
		return commission;
	}
	/**
	 * @param commission the commission to set
	 */
	public void setCommission(double commission) {
		if(commission > 0) {
			this.commission = commission;
		}
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SalesEmployee [toString()=" + super.toString() + ", numberOfSoldUnits=" + numberOfSoldUnits
				+ ", commission=" + commission + "]";
	}
	/* (non-Javadoc)
	 * @see Employee#calcluatePay()
	 */
	@Override
	public double calcluatePay() {
	
		double pay = numberOfSoldUnits * commission;
		return pay;
	}
	
	
	
}
