package ca.bcit.comp1451.lab08;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		Date d = new Date(2, 7, 2017);
		
		TwelveHourClock t = new TwelveHourClock(2, 8, 3, "AM");
		TwelveHourClock t2 = new TwelveHourClock(10, 18, 35, "PM");
		
		TwentyfourHourClock tw = new TwentyfourHourClock(5, 1, 0);
		TwentyfourHourClock tw2 = new TwentyfourHourClock(18, 10, 5);
		
		ArrayList<Displayable> date = new ArrayList<Displayable>();
		date.add(d);
		date.add(t);
		date.add(t2);
		date.add(tw);
		date.add(tw2);
		
		for(Displayable dis : date) {
			System.out.println(dis.getStringValue());
		}
		
	}

}
