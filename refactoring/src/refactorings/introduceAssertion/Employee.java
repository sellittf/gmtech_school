package refactorings.introduceAssertion;

import org.junit.Assert;

public class Employee {

    private static final double NULL_EXPENSE = -1.0;
    private double _expenseLimit = NULL_EXPENSE;
    private Project _primaryProject;
    
	double getExpenseLimit() {
		Assert.assertTrue(_expenseLimit != NULL_EXPENSE || _primaryProject != null);
		
		return (_expenseLimit != NULL_EXPENSE) ?
			_expenseLimit :
			_primaryProject.getMemberExpenseLimit();
	}

}
