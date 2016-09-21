package ch.seminar.view;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.Test;

import ch.seminar.Course;
import ch.seminar.Student;

public class HtmlRawTest {

	private Course _course; 

	@Before
	public void setUp() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		_course = new Course("course", "desc", "a101b", "here", 5, sdf.parse("2016-09-01"));
	}

	@Test
	public void courseRenderItSelf() {
		
		_course.enroll(new Student("xxx", "yyy"));
		
		assertThat(new Html(_course).render(), 
						is(
							"<html>"
								+ "<head>"
									+ "<title>course</title>"
								+ "</head>"
								+ "<body>"
									+ "<div>course:</div>"
									+ "<ul>"
										+ "<li>desc</li>"
										+ "<li>here</li>"
										+ "<li>start date: 01.09.2016</li>"
										+ "<li>4</li>"
									+ "</ul>"
									+ "<div>partecipanti:</div>"
									+ "<ul>"
										+ "<li>xxx yyy</li>"
									+ "</ul>"
								+ "</body>"
							+ "</html>"
						)
				);
	}
	
}
