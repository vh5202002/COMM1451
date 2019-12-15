/**
 * 
 */
package ca.bcit.comp1451.session05LabA;

/**
 * @author choya
 *
 */
public class ReadingMaterial {
	
	private String title;
	private int numberOfPages;
	
	/**
	 * constructor 
	 * @param title
	 * @param numberOfPages
	 */
	public ReadingMaterial(String title, int numberOfPages) {
		super();
		setTitle(title);
		setNumberOfPages(numberOfPages);
	}

	/**
	 * @return the title as a string 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		if(title != null && !title.isEmpty()) {
			this.title = title;
		}else {
			this.title = "unknown";
		}
	}

	/**
	 * @return the numberOfPages as a int
	 */
	public int getNumberOfPages() {
		return numberOfPages;
	}

	/**
	 * @param numberOfPages the numberOfPages to set
	 */
	public void setNumberOfPages(int numberOfPages) {
		if(numberOfPages > 0) {
			this.numberOfPages = numberOfPages;
		}
	}


	

}
