package caseStudy;

public class HrApp {

	public static void main(String[] args) {

		System.out.println("Welcome - Starting the HR App");

		Department testing = new Department(1, "Testing");


		Employee tester1 =  new Employee(100, "John1", 10.2);
		Employee tester2 =  new Employee(101, "John2", 8);
		Employee tester3 =  new Employee(102, "John3", 3);
		Employee tester4 =  new Employee(103, "John4", 14.4);
		Employee tester5 =  new Employee(104, "John5", 10.2);
		Employee tester6 =  new Employee(105, "John6", 8);
		Employee tester7 =  new Employee(106, "John7", 3);
		Employee tester8 =  new Employee(107, "John8", 14.4);
		Employee tester9 =  new Employee(108, "John9", 10.2);
		Employee tester10 =  new Employee(109, "John10", 8);
		Employee tester11 =  new Employee(110, "John11", 3);


		Employee[] testers = {tester1, tester2, tester3, tester4};
		Employee[] testers2 = {tester1, tester2, tester3, tester4, tester5, tester6, tester7, tester8, tester9, tester10, tester11};
		testing.setEmployees(testers2);

		System.out.println(testing);

		testing.identifyEmployee(190);

		System.out.println("Total salary of the department is: " + testing.getDepartmentSalarySum());
		System.out.println("Average salary of the department is: " + testing.getAverageDepartmentSalary());

	}
}
