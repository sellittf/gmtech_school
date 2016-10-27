package refactorings.replaceTypeCodeWithStateStrategy;

public class Salesman extends EmployeeType {

	int payAmount(){
		return _monthlySalary + _commission;
	}

}
