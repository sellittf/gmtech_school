package ch.seminar.view;

import java.text.SimpleDateFormat;

import ch.seminar.Course;
import ch.seminar.Student;

public class Html implements View {

	private Course _course;
	private SimpleDateFormat _sdf = new SimpleDateFormat("dd.MM.yyyy");

	public Html(Course course) {
		_course = course;
	}

	@Override
	public String render() {
		
		String studentList = "<ul>";
		for (Student student : _course.getStudents()) {
			studentList += "<li>" + student.getFullName() + "</li>";
		}
		studentList += "</ul>";
		
		return 
	    "<html>" + 
		"<head>" +
	    	"<title>" + _course.getName() + "</title>" +
		"</head>" + 
		"<body>" +
		    "<div>" + _course.getName() + ":</div>" +
		    "<ul>" +
		          "<li>" + _course.getDescription() + "</li>" +
		          "<li>" + _course.getLocation() + "</li>" +
		          "<li>start date: " + _sdf.format(_course.getStartDate()) + "</li>" +
		          "<li>" + _course.getSeatsLeft() + "</li>" +
		    "</ul>" +
		    "<div>partecipanti:</div>" +
		    studentList +
		"</body>" +
		"</html>";
	}

}
