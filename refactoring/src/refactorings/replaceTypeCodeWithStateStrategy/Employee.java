package refactorings.replaceTypeCodeWithStateStrategy;

public class Employee {

	static final int ENGINEER = 0;
	static final int SALESMAN = 1;
	static final int MANAGER = 2;
	
	private EmployeeType _type;

	Employee(int type) {
		switch (type) {
		case ENGINEER:
			_type = new Engineer();
			break;
		case SALESMAN:
			_type = new Salesman();
			break;
		case MANAGER:
			_type = new Manager();
			break;
		default:
			throw new RuntimeException("Incorrect Employee");
		}
	}

	int payAmount() {
		return _type.payAmount();
	}
}
