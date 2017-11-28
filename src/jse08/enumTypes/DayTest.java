package jse08.enumTypes;

public class DayTest {

	Day day;

	public DayTest(Day day) {
		this.day = day;
	}

	public void todayIs() {

		switch (this.day) {
			case MONDAY:
				System.out.println("Today is monday.");
				break;
			case TUESDAY:
				System.out.println("Today is tuesday.");
				break;
			case WEDNESDAY:
				System.out.println("Today is wednesday.");
				break;
			case THURSDAY:
				System.out.println("Today is thursday.");
				break;
			case FRIDAY:
				System.out.println("Today is friday.");
				break;
			case SATURDAY:
				System.out.println("Today is saturday.");
				break;
			case SUNDAY:
				System.out.println("Today is sunday.");
				break;
		}
	}
}
