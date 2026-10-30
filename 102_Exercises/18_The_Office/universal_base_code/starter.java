/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();

	Employee Dwight = new Employee(1987," Dwight","Schrute", 4416.66);
	Employee Jim = new Employee(2474,"Jim"," Halpert", 4416.66);
	Employee Pam = new Employee(2011,"Pam"," Beesly", 2250);
	Employee John = new Employee(999,"John"," Joe", 1);

	Dwight.raiseSalary (100);
	Jim.raiseSalary (100);
	Pam.raiseSalary (100);
	John.raiseSalary (10000000);

	System.out.println(Dwight.getFirstName() + Dwight.getLastName());
	System.out.println("Salary: " + Dwight.getSalary());
	System.out.println("Annual salary: " + Dwight.getAnnualSalary());
	System.out.println();
	System.out.println(Jim.getFirstName() + Jim.getLastName());
	System.out.println("Salary: " + Jim.getSalary());
	System.out.println("Annual salary: " + Jim.getAnnualSalary());
	System.out.println();
	System.out.println(Pam.getFirstName() + Pam.getLastName());
	System.out.println("Salary: " + Pam.getSalary());
	System.out.println("Annual salary: " + Pam.getAnnualSalary());
	System.out.println();
	System.out.println(John.getFirstName() + John.getLastName());
	System.out.println("Salary: " + John.getSalary());
	System.out.println("Annual salary: " + John.getAnnualSalary());
	

	}
}
