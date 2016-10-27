package refactorings.replaceTypeCodeWithSubclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {
	@Test
	public void testBySuperclass() {
		Employee employee = Employee.create(Employee.MANAGER);
		assertEquals("Manager", employee.getClass().getSimpleName());

		employee = Employee.create(Employee.SALESMAN);
		assertEquals("Salesman", employee.getClass().getSimpleName());

		employee = Employee.create(Employee.ENGINEER);
		assertEquals("Engineer", employee.getClass().getSimpleName());
	}
	
	@Test
	public void testBySubclass() {
		Employee employee = new Manager();
		assertEquals("Manager", employee.getClass().getSimpleName());

		employee = new Salesman();
		assertEquals("Salesman", employee.getClass().getSimpleName());

		employee = new Engineer();
		assertEquals("Engineer", employee.getClass().getSimpleName());
	}
}
