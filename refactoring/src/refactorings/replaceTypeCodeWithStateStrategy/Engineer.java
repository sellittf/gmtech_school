package refactorings.replaceTypeCodeWithStateStrategy;

public class Engineer extends EmployeeType {

	int payAmount(){
		return _monthlySalary;
	}

}
