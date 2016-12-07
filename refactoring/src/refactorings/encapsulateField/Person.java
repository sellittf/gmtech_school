package refactorings.encapsulateField;

public class Person {

	private String _name;
	
	public String getName() {
		return _name;
	}
  
	public void setName(String arg) {
		_name = arg;
	}	

}
