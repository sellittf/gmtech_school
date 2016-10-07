package refactoring;

import java.util.ArrayList;

class Customer {
	private String _name;
	private ArrayList<Rental> _rentals = new ArrayList<Rental>();

	public Customer(String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.add(arg);
	}

	private int getFrequentRenterPoints() {
		int frequentRenterPoints = 0;

		for (Rental rental : _rentals)
			frequentRenterPoints += rental.getPoints();

		return frequentRenterPoints;
	}

	private double getTotalAmount() {
		double totalAmount = 0;

		for (Rental rental : _rentals)
			totalAmount += rental.getAmount();

		return totalAmount;
	}

	public String statement() {
		String result = "Rental Record for " + _name + "\n";

		for (Rental rental : _rentals)
			result += rental.showFigures();

		result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
		result += "You earned " + String.valueOf(getFrequentRenterPoints())
				+ " frequent renter points";

		return result;
	}
}
