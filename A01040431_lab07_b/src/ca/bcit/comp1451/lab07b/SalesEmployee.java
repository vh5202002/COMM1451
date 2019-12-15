/**
 * 
 */
package ca.bcit.comp1451.lab07b;

/**
 * @author choya
 *
 */
public class SalesEmployee extends Employee{
	
	private int numberOfsoldUnits;
	private double commissionRatePerUnit;
	
	/**
	 * constructor 
	 * @param name
	 */
	public SalesEmployee(String name, int numberOfsoldUnits, double commissionRatePerUnit) {
		super(name);
		// TODO Auto-generated constructor stub
		setNumberOfsoldUnits(numberOfsoldUnits);
		setCommissionRatePerUnit(commissionRatePerUnit);
	}

	/**
	 * @return the numberOfsoldUnits as a int 
	 */
	public int getNumberOfsoldUnits() {
		return numberOfsoldUnits;
	}

	/**
	 * @param numberOfsoldUnits the numberOfsoldUnits to set
	 */
	public void setNumberOfsoldUnits(int numberOfsoldUnits) {
		if(numberOfsoldUnits > 0) {
			this.numberOfsoldUnits = numberOfsoldUnits;
		}else {
			throw new IllegalArgumentException("Enter Number of units number");
		}
	}

	

	/**
	 * @return the commissionRatePerUnit as a double 
	 */
	public double getCommissionRatePerUnit() {
		return commissionRatePerUnit;
	}

	/**
	 * @param commissionRatePerUnit the commissionRatePerUnit to set
	 */
	public void setCommissionRatePerUnit(double commissionRatePerUnit) {
		if(commissionRatePerUnit > 0.0) {
			this.commissionRatePerUnit = commissionRatePerUnit;
		}else {
			throw new IllegalArgumentException("Enter Commission Rate");
		}
		
	}

	/* (non-Javadoc)
	 * @see ca.bcit.comp1451.lab07b.Employee#calcluatePay()
	 */
	@Override
	public double calcluatePay() {
		double pay = numberOfsoldUnits * commissionRatePerUnit;
		return pay;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " Type of Employees “sales” " + ", Number Of Units Sold: " + numberOfsoldUnits
				+ ", Commission Rate Per Unit: " + commissionRatePerUnit + ", Pay: " + calcluatePay();
	}



}
