/**
 * 
 */
package a01040431_lab08a;

/**
 * @author choya
 *
 */
public class CommissionEmployee extends Employee{
	private double commissionRate;
	private double monthlySalesTotal;
	
	/**
	 * default constructor 
	 */
	public CommissionEmployee() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * Overloaded constructor
	 * @param name the name to set
	 * @param commissionRate the commissionRate to set
	 * @param monthlySalesTotal the monthlySalesTotal to set
	 */
	public CommissionEmployee(String name, double commissionRate,
			double monthlySalesTotal) {
		super(name);
		// TODO Auto-generated constructor stub
		setCommissionRate(commissionRate);
		setMonthlySalesTotal(monthlySalesTotal);
	}



	/**
	 * @return the commissionRate as double
	 */
	public double getCommissionRate() {
		return commissionRate;
	}

	/**
	 * @param commissionRate the commissionRate to set
	 */
	public void setCommissionRate(double commissionRate) {
		if(commissionRate >= 0) {
			this.commissionRate = commissionRate;
		}
	}

	/**
	 * @return the monthlySalesTotal as double
	 */
	public double getMonthlySalesTotal() {
		return monthlySalesTotal;
	}

	/**
	 * @param monthlySalesTotal the monthlySalesTotal to set
	 */
	public void setMonthlySalesTotal(double monthlySalesTotal) {
		if(monthlySalesTotal >= 0) {
			this.monthlySalesTotal = monthlySalesTotal;
		}
	}


	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CommissionEmployee [commissionRate=" + commissionRate + ", monthlySalesTotal=" + monthlySalesTotal
				+ ", toString()=" + super.toString() + "]";
	}



	/**
	 * implementation of abstract method calculateMonthlyEarnings
	 */
	public double calculateMonthlyEarnings() {
		return monthlySalesTotal * commissionRate;
	};
}
