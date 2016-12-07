package refactorings.introduceForeignMethod;

import java.util.Date;

public class Reservation {

	Date startDate;

	public Reservation(Date previousEnd){
		Date newStart = new Date(previousEnd.getYear(), previousEnd.getMonth(), previousEnd.getDate() + 1);
		startDate = newStart;
	}
	
	
}
