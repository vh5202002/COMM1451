/**
 * 
 */
package a01040431_lab08a;

/**
 * @author choya
 *
 */
public abstract class Employee {
	private String name;

	
	/**
	 * default constructor 
	 */
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Overloaded constructor
	 * @param name the name to set
	 */
	public Employee(String name) {
		super();
		setName(name);
	}


	/**
	 * @return the name as string
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		if(name != null && !name.trim().isEmpty()) {
			this.name = name;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	/**
	 * abstract calculateMonthlyEarnings
	 * @return abstract calculateMonthlyEarnings
	 */
	public abstract double calculateMonthlyEarnings();

}
