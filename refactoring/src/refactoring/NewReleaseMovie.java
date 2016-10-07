package refactoring;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String title) {
		super(title);
	}

	@Override
	protected double basePrice(){
		return 0;
	}

	@Override
	protected int baseDays(){
		return 0;
	}
	
	@Override
	protected double dayPrice(){
		return 3;
	}
	
}