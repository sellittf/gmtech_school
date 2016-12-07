package refactorings.introduceAssertion;

public class Employee {

    private static final double NULL_EXPENSE = -1.0;
    private double _expenseLimit = NULL_EXPENSE;
    private Project _primaryProject;
    
	double getExpenseLimit() {
		// should have either expense limit or a primary project
		return (_expenseLimit != NULL_EXPENSE) ?
			_expenseLimit :
			_primaryProject.getMemberExpenseLimit();
	}

}
