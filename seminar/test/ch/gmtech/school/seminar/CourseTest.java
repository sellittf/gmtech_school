package ch.gmtech.school.seminar;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {
	
	private Course course;

	@Before
	public void setUp() throws Exception {
		this.course = new Course("Crash course", new Date("2016-09-01"));
	}

	@Test
	public void testGetName() {
		assertEquals(this.getName(), "Crash course");
	}

	@Test
	public void testGetNumber() {
		assertEquals(this.getNumber(), 1);
	}

	@Test
	public void testGetStartDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		assertEquals(sdf.format(this.getStartDate()), sdf.format(new Date("2016-09-01")));
	}

}
