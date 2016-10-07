package refactoring;

public class Movie {
	protected String _title;
	
	public Movie(String title) {
		_title = title;
	}

	public String getTitle() {
		return _title;
	}
	
	public double getRentalPrice(int daysRented){
		double amount = basePrice();
		if (daysRented > baseDays())
			amount += (daysRented - baseDays()) * dayPrice();
		return amount;
	}
	
	protected double basePrice(){
		return 2;
	}

	protected int baseDays(){
		return 2;
	}
	
	protected double dayPrice(){
		return 1.5;
	}
}