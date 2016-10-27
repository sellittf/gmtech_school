package refactorings.replaceTypeCodeWithStateStrategy;

public abstract class EmployeeType {

	protected final int _monthlySalary = 2000;
	protected final int _commission = 100;
	protected final int _bonus = 500;

	abstract int payAmount();

}
