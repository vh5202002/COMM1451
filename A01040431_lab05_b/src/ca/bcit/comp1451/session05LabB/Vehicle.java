/**
 * 
 */
package ca.bcit.comp1451.session05LabB;

/**
 * @author choya
 *
 */
public class Vehicle {

	private int yearManufactured;
	private String make;
	private String model;
	
	/**
	 * constructor
	 * @param yearManufactured
	 * @param make
	 * @param model
	 */
	public Vehicle(int yearManufactured, String make, String model) {
		
		setYearManufactured(yearManufactured);
		setMake(make);
		setModel(model);
	}
	


	/**
	 * @return the yearManufactured as a int
	 */
	public int getYearManufactured() {
		return yearManufactured;
	}

	/**
	 * @param yearManufactured the yearManufactured to set
	 */
	public void setYearManufactured(int yearManufactured) {
		if(yearManufactured > 0 ) {
			this.yearManufactured = yearManufactured;
		}
	}

	/**
	 * @return the make as a string
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		if(make != null && !make.isEmpty()) {
			this.make = make;
		}else {
			this.make = "unknown";
		}
	}

	/**
	 * @return the model as a string
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		if(model != null && !model.isEmpty()) {
			this.model = model;
		}else {
			this.model = "unknown";
		}
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + yearManufactured;
		return result;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (yearManufactured != other.yearManufactured)
			return false;
		return true;
	}
	


}
