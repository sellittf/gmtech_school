package ch.gmtech.school.seminar;

import java.util.ArrayList;
import java.util.List;

public class Seminar {

	private String _name;
	private String _description;
	private String _location;
	private int _seats;
	
	private List<Enrollment> _enrollments = new ArrayList<Enrollment>();
	private List<Course> _courses = new ArrayList<Course>();

	public Seminar(String name, String description, String location, int seats) {
		_name = name;
		_description = description;
		_location = location;
		_seats = seats;
	}
	
	public String getName() {
		return _name; 
	}	

	public String getDescription() {
		return _description; 
	}
	
	public String getLocation() {
		return _location; 
	}
	
	public int getSeatsLeft() {
		return _seats - _enrollments.size();
	}
	
	public void addEnrollment(Student student, String info){
		Enrollment enrollment = new Enrollment(student, info);
		_enrollments.add(enrollment);
	}
	
	public List<Student> getStudentList(){
		List<Student> list = new ArrayList<Student>();
		for(Enrollment enrollment : _enrollments){
			list.add(enrollment._student);
		}
		return list;
	}

	public void addCourse(Course course){
		_courses.add(course);
	}
	
	public List<Course> getCourseList(){
		return _courses;
	}
}
