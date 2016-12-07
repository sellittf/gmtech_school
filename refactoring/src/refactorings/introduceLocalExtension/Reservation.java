package refactorings.introduceLocalExtension;

import java.util.Date;

public class Reservation {

	Date startDate;

	public Reservation(ExtendedDate previousEnd){
		startDate = previousEnd.nextDay();
	}
	
}
