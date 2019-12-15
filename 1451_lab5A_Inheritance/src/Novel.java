
public class Novel extends ReadingMaterial{
	
	private String mainCharacterName;
	private String theme;
	private String novelistName;
	/**
	 * @param title
	 * @param numberOfPages
	 */
	public Novel(String title, int numberOfPages,String mainCharacterName,
			String theme, String novelistName) {
		super(title, numberOfPages);
		setMainCharacterName(mainCharacterName);
		setTheme(theme);
		setNovelistName(novelistName);
	}
	/**
	 * @return the mainCharacterName
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
	 * @return the theme
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
	 * @return the novelistName
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
	
	public void displayDetails() {
		System.out.println("title: " +getTitle());
		System.out.println("Main character name:" + mainCharacterName);
		System.out.println("theme: " + theme);
		System.out.println("novelist name: " + novelistName);
	}

}
