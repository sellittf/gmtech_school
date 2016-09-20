package ch.gmtech.school.seminar;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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
		assertThat(_course.getName(), is("Crash course"));
	}

	@Test
	public void testGetNumber() {
		assertThat(_course.getNumber(), is(1));
	}

	@Test
	public void testGetStartDate() {
		assertThat(_course.getStartDate(), is(new Date(2016,9,1)));
	}

}
