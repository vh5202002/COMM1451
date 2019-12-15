package ca.bcit.comp1451.lab08;

public abstract class Clock implements Displayable{

	private int minute;
	private int second;
	private static final int FIRST = 0;
	private static final int LAST = 59;
	
	/**
	 * @param minute
	 * @param second
	 */
	public Clock(int minute, int second) {
		super();
		setMinute(minute);
		setSecond(second);
	}
	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}
	/**
	 * @param minute the minute to set
	 */
	public void setMinute(int minute) {
		if(minute >= FIRST && minute <= LAST) {
			this.minute = minute;
		}
	}
	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}
	/**
	 * @param second the second to set
	 */
	public void setSecond(int second) {
		if(second >= FIRST && second <= LAST) {
			this.second = second;
		}
	}
	
	/**
	 * abstract
	 * @param hour
	 */
	public abstract void setHour(int hour);
	
	/**
	 * abstract
	 * @return
	 */
	public abstract int getHour();

}
