package ca.bcit.comp1451.lab08;

public class TwelveHourClock extends Clock{
	
	private String meridiem;
	private int hour;
	/**
	 * @param minute
	 * @param second
	 */
	public TwelveHourClock(int hour, int minute,  int second, String meridiem){
		super(minute, second);
		setHour(hour);
		setMeridiem(meridiem);
	
		
	}
	/**
	 * @return the meridiem
	 */
	public String getMeridiem() {
		return meridiem;
	}
	/**
	 * @param meridiem the meridiem to set
	 */
	public void setMeridiem(String meridiem) {
		if(meridiem.equals("AM")) {
			this.meridiem = meridiem;
		}else if(meridiem.equals("PM")) {
			this.meridiem = meridiem;
		}else {
			this.meridiem = "AM";
		}
	
	}

	@Override
	public int getHour() {
		
		return hour;
	}
	
	@Override
	public void setHour(int hour) {
		if(hour >= 0 && hour <=11) {
			this.hour = hour;
		}else {
			this.hour = 0;
		}
	}
	
	
	/* (non-Javadoc)
	 * @see ca.bcit.comp1451.lab08.Displayable#getStringValue()
	 */
	@Override
	public String getStringValue() {
		String input = hour + ":" + getMinute() + ":" + getSecond() + " " + getMeridiem();
		String input1 = "0" + hour + ":" + "0" + getMinute() + ":" + "0" + getSecond() + " " + getMeridiem();
		if(hour >= 10) {
			return input;
		}
		return input1;
		
		
	
	}

	
	

}
