package refactorings.inlineClass;

public class Person {
    private String _name;
    private String _telephoneNumber;
    private String _telephoneAreaCode;
    
    public String getName() {
        return _name;
    }
    
    public String getTelephoneNumber(){
    	return ("(" + _telephoneAreaCode + ") " + _telephoneNumber);
    }
    
    void setAreaCode(String arg) {
    	_telephoneAreaCode = arg;
    }
    
    void setNumber(String arg) {
    	_telephoneNumber = arg;
    }
}
