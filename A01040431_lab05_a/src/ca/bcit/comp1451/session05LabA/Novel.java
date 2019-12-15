/**
 * 
 */
package ca.bcit.comp1451.session05LabA;

/**
 * @author choya
 *
 */
public class Novel extends ReadingMaterial {
	private String mainCharacterName;
	private String theme;
	private String novelistName;
	
	/**
	 * constructor 
	 * @param title
	 * @param numberOfPages
	 * @param mainCharacterName
	 * @param theme
	 * @param novelistName
	 */
	public Novel(String title, int numberOfPages, String mainCharacterName
			, String theme, String novelistName) {
		
		super(title, numberOfPages);
		setMainCharacterName(mainCharacterName);
		setTheme(theme);
		setNovelistName(novelistName);
	}

	/**
	 * @return the mainCharacterName as a string
	 */
	public String getMainCharacterName() {
		return mainCharacterName;
	}

	/**
	 * @param mainCharacterName the mainCharacterName to set
	 */
	public void setMainCharacterName(String mainCharacterName) {
		this.mainCharacterName = mainCharacterName;
	}

	/**
	 * @return the theme as a string
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * @param theme the theme to set
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}

	/**
	 * @return the novelistName as a string
	 */
	public String getNovelistName() {
		return novelistName;
	}

	/**
	 * @param novelistName the novelistName to set
	 */
	public void setNovelistName(String novelistName) {
		this.novelistName = novelistName;
	}
	
	/**
	 * diplayDetails
	 */
	public void diplayDetails() {
		System.out.println("Title: " + getTitle());
		System.out.println("Main character name: " + mainCharacterName);
		System.out.println("theme: " + theme);
		System.out.println("Novelist name: " + novelistName);
	}
	
	

}
