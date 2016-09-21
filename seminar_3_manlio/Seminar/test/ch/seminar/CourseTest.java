package ch.seminar;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

public class CourseTest {

	private Course _course; 

	@Before
	public void setUp() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		_course = new Course("name", "description", "1", "somewhere", 1, sdf.parse("2016-09-01"));
	}
	
	@Test
	public void enrollingAStudentDecreaseSeatsLeft() {
		
		_course.enroll(new Student("a", "b"));
		
		assertThat(_course.getSeatsLeft(), is(0));
	}

	@Test
	public void cantEnrollStudentOverTotal() {
		try {
			_course.enroll(new Student("a", "b"));
			_course.enroll(new Student("c", "d"));
	        
			fail("Expected an RuntimeException to be thrown");
	    } catch (RuntimeException rte) {
	        assertThat(rte.getMessage(), is("Student: c d can't be enrolled. Seats terminated"));
	    }
	}

   @Test
   public void startDateIsDefined() throws ParseException{
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	   assertThat(_course.getStartDate(), is(sdf.parse("2016-09-01")));
   }

}
