/**
 * 
 */
package a01040431_lab01a;

/**
 * @author a01040431
 *
 */
public class Dog {

	private String name;
	private String breed;
	private int age;

	/**
	 * 
	 */
	public Dog() {
		super();
	}

	/**
	 * @param name  a String to set the name field
	 * @param breed a String to set the breed field
	 * @param age   a int to set the age field
	 */
	public Dog(String name, String breed, int age) {
		super();
		// this.name = name;
		setName(name);
		this.breed = breed;
		this.age = age;
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
		
		if( name != null && !name.isEmpty()) {
			this.name = name;
		}else {
			//this.name = "nobody";
			//throw new IllegalArgumentException();
			System.out.println("Error : invalid data!");
		}
	}

	/**
	 * @return the breed as a String
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return the age as a int
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

}
