package refactorings.hideMethod;

public class Employee {

	private String name;
	private boolean teamManager;
	
	public boolean isTeamManager(){
		return teamManager;
	} 
	
	public String getLabel(){
		String s = name;
		if(isTeamManager()) s += " (team manager)";
		return s;
	}

}
