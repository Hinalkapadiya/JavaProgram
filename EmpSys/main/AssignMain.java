package main;
import assignment.employees.Develloper;
import assignment.employees.Manager;
import assignment.utilities.*;

public class AssignMain 
{

	public static void main(String[] args) 
	{
		Manager mng = new Manager();
		mng.setName("Hirva");
		mng.setEmployeeId("M12");
		mng.setSalary(95000);
		mng.setDepartment("HR");
		
		Develloper dev = new Develloper();
		dev.setName("Dipal");
		dev.setEmployeeId("D45");
		dev.setSalary(90000);
		dev.setProgrammingLanguage("Python");
		
		System.out.println("Manager Details: ");
		EmployeeUtilities.printEmployeeDetails(mng);
		System.out.println("Department: " + mng.getDepartment());
		
		System.out.println("\nDeveloper Details: ");
		EmployeeUtilities.printEmployeeDetails(dev);
		System.out.println("Programming language: " + dev.getProgrammingLanguage());
	
		// Update Salary
		EmployeeUtilities.updateEmployeeSalary(mng, 120000);
		System.out.println("\nUpdated Manager Salary: " + mng.getSalary());
	}

}
