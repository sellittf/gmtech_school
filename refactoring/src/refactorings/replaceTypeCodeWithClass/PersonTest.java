package refactorings.replaceTypeCodeWithClass;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {
	@Test
	public void testName() {
		Person person = new Person(3);
		assertEquals("AB", person.getBloodGroup());
	}
}
