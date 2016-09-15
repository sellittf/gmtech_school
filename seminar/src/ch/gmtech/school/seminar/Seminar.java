package ch.gmtech.school.seminar;

import java.util.ArrayList;

public class Seminar {

	private String name;
	private String description;
	private String location;
	private int seats;
	
	private ArrayList<Enrollment> enrollments;

	public Seminar(String name, String description, String location, int seats) {
		this.name = name;
		this.description = description;
		this.location = location;
		this.seats = seats;
	}
	
	public String getName() {
		return this.name; 
	}	

	public String getDescription() {
		return this.description; 
	}
	
	public String getLocation() {
		return this.location; 
	}
	
	public int getSeatsLeft() {
		return this.seats - this.enrollments.size();
	}
	
	public ArrayList<Student> getStudentList(){
		ArrayList<Student> list = new ArrayList<Student>();
		for(Enrollment enrollment : enrollments){
			list.add(enrollment.student);
		}
		return list;
	}
}