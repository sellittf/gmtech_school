package refactorings.introduceLocalExtension;

import java.util.Date;

public class Reservation {

	Date startDate;

	public Reservation(Date previousEnd){
		startDate = nextDay(previousEnd);
	}
	
	private static Date nextDay(Date arg) {
		return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
	}
}
