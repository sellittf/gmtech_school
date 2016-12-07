package refactorings.encapsulateCollection;

import java.util.HashSet;
import java.util.Set;

public class Person {

    private Set _courses = new HashSet();

    public Set getCourses() {
        return _courses;
    }

    public void addCourse (Course arg) {
        _courses.add(arg);
    }
    
    public void removeCourse (Course arg) {
        _courses.remove(arg);
    }
}
