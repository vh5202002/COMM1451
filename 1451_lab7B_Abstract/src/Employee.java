
public abstract class Employee {

	private String name;

	/**
	 * @param name
	 */
	public Employee(String name) {
		super();
		this.name = name;
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
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}else {
			throw new IllegalArgumentException("");
		}
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	public abstract double calcluatePay();

}
