package refactorings.replaceConditionalWithPolymorphism;

public class European extends Bird {

	@Override
	double getSpeed() {
		return getBaseSpeed();
	}

	double getBaseSpeed() {
		return 10;
	}

}
