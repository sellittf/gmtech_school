package refactoring;

class Rental {
	private Movie _movie;
	private int _daysRented;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getPoints() {
		return manyDaysNewRelease() ? 2 : 1;
	}

	private boolean manyDaysNewRelease() {
		return (_movie instanceof NewReleaseMovie) && _daysRented > 1;
	}

	double getAmount() {
		return _movie.getRentalPrice(_daysRented);
	}

	public String showFigures() {
		return "\t" + _movie.getTitle() + "\t" + String.valueOf(getAmount()) + "\n";
	}
}