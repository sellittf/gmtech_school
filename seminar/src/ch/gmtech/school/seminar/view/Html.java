package ch.gmtech.school.seminar.view;

import ch.gmtech.school.seminar.Student;

public class Html extends OutputFormat {

	@Override
	public String render(Student student) {
		String html = "<html><head><title>" + student.getFullName() + "</title></head>" +
						"<body>" + 
						"<div>Name:" + student.getFullName() + "</div>" +
						"<div>Info:" + student.getInfo() + "</div>" +
						"</body></html>";
		return html;
	}

}
