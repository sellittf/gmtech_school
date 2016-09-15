package ch.gmtech.school.seminar.view;

import ch.gmtech.school.seminar.Student;

public class Csv extends OutputFormat {

	@Override
	public String render(Student student) {
		String csv = student.getFullName() + ";" + student.getInfo();
		return csv;
	}

}
