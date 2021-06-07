package caseStudy;

import java.util.Arrays;
import java.util.Objects;

public class Department {

	private long id;
	private String name;
	private Employee[] employees =  new Employee[10];

	public Department () {
	}

	public Department(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Department(long id, String name, Employee[] employees) {
		this.id = id;
		this.name = name;
		this.employees = employees;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee[] getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employee[] employees) {
		if (employees.length > this.employees.length) {
			this.employees = Arrays.copyOfRange(employees, 0, this.employees.length);
		} else
		{
			this.employees = employees;
		}
	}

	public int getNumberOfEmployees() {
		return this.getEmployees().length;
	}

	public void identifyEmployee(long id) {
		Employee foundEmployee = Arrays.stream(this.getEmployees()).filter(e -> id == e.getId()).findFirst().orElse(null);
		if (Objects.nonNull(foundEmployee)) {
			System.out.println("Found Employee with id: " + id + "." +  System.lineSeparator() + foundEmployee);
		} else {
			System.out.println("Did not found any employee with id: " + id);
		}
	}

	public double getDepartmentSalarySum() {
		double total = 0;
		for(Employee employee: this.getEmployees()) {
			total = total + employee.getSalary();
		}
		return total;
	}

	public double getAverageDepartmentSalary() {
		if (this.getNumberOfEmployees() == 0) {
			throw new ArithmeticException();
		} else {
			return getDepartmentSalarySum() / this.getNumberOfEmployees();
		}
	}

	@Override
	public String toString() {
		return "Listing information about department id: " + this.getId() + System.lineSeparator()
				+ "Department: " +  this.getName() + System.lineSeparator()
				+ Arrays.toString(this.getEmployees());
	}
}
