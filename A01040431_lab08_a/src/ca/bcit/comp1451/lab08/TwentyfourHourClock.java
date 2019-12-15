package ca.bcit.comp1451.lab08;

public class TwentyfourHourClock extends Clock{

	private int hour;

	/**
	 * @param minute
	 * @param second
	 */
	public TwentyfourHourClock(int hour, int minute, int second) {
		super(minute, second);
		// TODO Auto-generated constructor stub
		setHour(hour);
	}


	/* (non-Javadoc)
	 * @see ca.bcit.comp1451.lab08.Clock#setHour(int)
	 */
	@Override
	public void setHour(int hour) {
		if(hour >= 0 && hour <= 23) {
			this.hour = hour;
		}else {
			this.hour = 0;
		}
		
	}

	/* (non-Javadoc)
	 * @see ca.bcit.comp1451.lab08.Clock#getHour()
	 */
	@Override
	public int getHour() {
		
		return hour;
	}
	
	/* (non-Javadoc)
	 * @see ca.bcit.comp1451.lab08.Displayable#getStringValue()
	 */
	@Override
	public String getStringValue() {
		String input = hour + ":" + getMinute() + ":" + "0" + getSecond() ;
		String input1 = "0" + hour + ":" + "0" + getMinute() + ":" + "0" + getSecond() ;
		if(hour >= 10) {
			return input;
		}
		return input1;
		
		
	}
	
}
