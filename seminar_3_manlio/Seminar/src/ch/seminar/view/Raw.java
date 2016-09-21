package ch.seminar.view;

import static ch.seminar.util.Format.newLine;

import java.text.SimpleDateFormat;

import ch.seminar.Course;
import ch.seminar.Student;

public class Raw implements View {

	private Course _course;
	private SimpleDateFormat _sdf = new SimpleDateFormat("dd.MM.yyyy");
	
	public Raw(Course course) {
		_course = course;
	}
	
	@Override
	public String render() {
		String studentList = "";
		for (Student student : _course.getStudents()) {
			studentList += newLine(student.getFullName());
		}
		return newLine(_course.getName() + " " + _course.getNumber() + ": " + _course.getDescription()) +
			   newLine("location: " + _course.getLocation()) +
		       newLine("start date: " + _sdf.format(_course.getStartDate())) +
			   newLine("seats left: " + _course.getSeatsLeft()) +
			   newLine("") +
			   newLine("Enrollment:") +
			   studentList;
	}

}
