package ch.gmtech.school.seminar;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {
	
	private Course _course;

	@Before
	public void setUp() throws Exception {
		_course = new Course("Crash course", 1, new Date(2016,9,1));
	}

	@Test
	public void testGetName() {
		assertEquals(_course.getName(), "Crash course");
	}

	@Test
	public void testGetNumber() {
		assertEquals(_course.getNumber(), 1);
	}

	@Test
	public void testGetStartDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		assertEquals(sdf.format(_course.getStartDate()), sdf.format(new Date(2016,9,1)));
	}

}
