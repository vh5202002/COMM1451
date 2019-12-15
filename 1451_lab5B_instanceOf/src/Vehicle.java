
public class Vehicle {
	
	private int year;
	private String mark;
	private String model;
	/**
	 * @param year
	 * @param mark
	 * @param model
	 */
	public Vehicle(int year, String mark, String model) {
		super();
		this.year = year;
		this.mark = mark;
		this.model = model;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the mark
	 */
	public String getMark() {
		return mark;
	}
	/**
	 * @param mark the mark to set
	 */
	public void setMark(String mark) {
		this.mark = mark;
	}
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	
}
