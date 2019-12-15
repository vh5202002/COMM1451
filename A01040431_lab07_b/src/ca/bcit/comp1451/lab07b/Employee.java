/**
 * 
 */
package ca.bcit.comp1451.lab07b;

/**
 * @author choya
 *
 */
public abstract class Employee {

	private String name;

	/**
	 * constructor
	 * @param name
	 */
	public Employee(String name) {
		super();
		setName(name);
	}

	/**
	 * @return the name as a string
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
			throw new IllegalArgumentException("Please Enter your name");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee name: " + name ;
	}

	/**
	 * abstract
	 * @return
	 */
	public abstract double calcluatePay();
	
	
	

}
