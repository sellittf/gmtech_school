package refactorings.replaceConditionalWithPolymorphism;

public class NorwegianBlue extends Bird {

	private boolean _isNailed;
	private double _voltage;

	@Override
	double getSpeed() {
		return (_isNailed) ? 0 : getBaseSpeed(_voltage);
	}

	double getBaseSpeed(double voltage) {
		return 10 * voltage;
	}

}
