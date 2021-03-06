package ch.seminar.view;

import static ch.seminar.util.Format.newLine;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

import ch.seminar.Course;
import ch.seminar.Student;

public class CsvTest {

	private Course _course; 

	@Before
	public void setUp() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		_course = new Course("course", "desc", "a101b", "here", 5, sdf.parse("2016-09-01"));
	}
	
	@Test
	public void courseRenderItSelf() {
		
		_course.enroll(new Student("xxx", "yyy"));
		
		assertThat(new Csv(_course).render(), 
						is(
						newLine("\"a101b\";\"desc\";\"here\";\"01.09.2016\";\"4\";") +
						newLine("\"xxx\";\"yyy\";")
					)
				);
	}
	
}
