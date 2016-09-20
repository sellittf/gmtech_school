package ch.gmtech.school.seminar;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SeminarTest {

	private Seminar _seminar;
	
	@Before
	public void setUp() throws Exception {
		_seminar = new Seminar("Online Marketing", "Quick introduction", "Aula magna", 15);
	}

	@Test
	public void testGetName() {
		assertEquals(_seminar.getName(), "Online Marketing");
	}

	@Test
	public void testGetDescription() {
		assertEquals(_seminar.getDescription(), "Quick introduction");
	}

	@Test
	public void testGetLocation() {
		assertEquals(_seminar.getLocation(), "Aula magna");
	}

	@Test
	public void testGetSeatsLeft() {
		assertEquals(_seminar.getSeatsLeft(), 15);
	}

	@Test
	public void testGetStudentList() {
		Student student1 = new Student("Pinco", "Pallino", "uno qualunque");
		_seminar.addEnrollment(student1, "marketing junior operator");
		Student student2 = new Student("Jorge", "Camacho", "olé");
		_seminar.addEnrollment(student2, "marketing advisor");
		
		List<Student> students = Arrays.asList(student1, student2);
		assertEquals(_seminar.getStudentList(), students);
	}

}
