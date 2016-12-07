package refactorings.removeSettingMethod;

public class Account {
	private String _id;

	Account (String id) {
       setId(id);
	}
	   
	void setId (String arg) {
      _id = arg;
   }
}
