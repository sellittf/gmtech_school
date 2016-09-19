package ch.gmtech.school.seminar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {
	
	private Course course;

	@Before
	public void setUp() throws Exception {
		this.course = new Course("Crash course", 1);
	}

	@Test
	public void testGetName() {
		assertEquals(this.getName(), "Crash course");
	}

	@Test
	public void testGetNumber() {
		assertEquals(this.getNumber(), 1);
	}

}
