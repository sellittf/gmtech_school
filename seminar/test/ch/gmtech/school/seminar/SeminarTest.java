package ch.gmtech.school.seminar;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SeminarTest {

	private Seminar seminar;
	
	@Before
	public void setUp() throws Exception {
		this.seminar = new Seminar("Online Marketing", "Quick introduction", "Aula magna", 15);
	}

	@Test
	public void testGetName() {
		assertEquals(this.getName(), "Online Marketing");
	}

	@Test
	public void testGetDescription() {
		assertEquals(this.getDescription(), "Quick introduction");
	}

	@Test
	public void testGetLocation() {
		assertEquals(this.getLocation(), "Aula magna");
	}

	@Test
	public void testGetSeatsLeft() {
		assertEquals(this.getSeatsLeft(), 15);
	}

	@Test
	public void testGetStudentList() {
		Student student1 = new Student("Pinco", "Pallino", "uno qualunque");
		this.seminar.addEnrollment(student1, "marketing junior operator");
		Student student2 = new Student("Jorge", "Camacho", "olé");
		this.seminar.addEnrollment(student2, "marketing advisor");
		
		ArrayList<Student> students = new ArrayList<Student>(student1, student2);
		assertEquals(this.testGetStudentList(), students);
	}

}
