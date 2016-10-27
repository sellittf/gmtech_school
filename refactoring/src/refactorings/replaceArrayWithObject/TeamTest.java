package refactorings.replaceArrayWithObject;

import static org.junit.Assert.*;

import org.junit.Test;

public class TeamTest {
	@Test
	public void statistic() {
		String[] row = new String[3];
		row [0] = "Liverpool";
	    row [1] = "15";
	    
	    String name = row[0];
	    int wins = Integer.parseInt(row[1]);
	    
	    assertEquals("Liverpool", name);
	    assertEquals(15, wins);
	}

	@Test
	public void statisticAsObject() {
		Team team = new Team("Liverpool");
		team.setWins(15);
	    
	    assertEquals("Liverpool", team.getName());
	    assertEquals(15, team.getWins());
	}

}
