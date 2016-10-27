package refactorings.replaceArrayWithObject;

public class Team {

	private String _name;
	private int _wins;
	
	Team(String name){
		_name = name;
	}

	public String getName() {
		return _name;
	}

	public int getWins() {
		return _wins;
	}

	public void setWins(int wins) {
		_wins = wins;
	}
	
	
}
