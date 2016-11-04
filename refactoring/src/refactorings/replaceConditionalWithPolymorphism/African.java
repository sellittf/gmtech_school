package refactorings.replaceConditionalWithPolymorphism;

public class African extends Bird {

	private int _numberOfCoconuts;

	@Override
	double getSpeed() {
		return getBaseSpeed() - getLoadFactor() * _numberOfCoconuts;
	}

	private int getLoadFactor() {
		return 3;
	}

	double getBaseSpeed() {
		return 10;
	}

}
