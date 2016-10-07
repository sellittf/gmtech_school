package refactoring;

public class ChildrensMovie extends Movie {

	public ChildrensMovie(String title) {
		super(title);
	}

	@Override
	protected double basePrice(){
		return 1.5;
	}

	@Override
	protected int baseDays(){
		return 3;
	}

}