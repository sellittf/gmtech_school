package refactorings.replaceTypeCodeWithStateStrategy;

public class Manager extends EmployeeType {

	int payAmount(){
		return _monthlySalary + _bonus;
	}

}
