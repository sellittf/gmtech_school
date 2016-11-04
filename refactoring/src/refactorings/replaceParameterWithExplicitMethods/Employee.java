package refactorings.replaceParameterWithExplicitMethods;

public class Employee {

    static Engineer createEngineer() {
    	return new Engineer();    	
    }

    static Salesman createSalesman() {
    	return new Salesman();    	
    }

    static Manager createManager() {
    	return new Manager();    	
    }

}
