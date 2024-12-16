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
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 44166.6);
		jim.employeeToString();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		
		Employee noah = new Employee(2007, "Noah", "Ivynian", 10000);
		noah.employeeToString();
		
		
		dwight.raiseSalary(20);
		jim.raiseSalary(20);
		pam.raiseSalary(20);
		noah.raiseSalary(20);
		
		System.out.println("Dwights annual salary- " + dwight.getAnnualSalary());
		System.out.println("Jims annual salary- " + jim.getAnnualSalary());
		System.out.println("Pams annual salary- " + pam.getAnnualSalary());
		System.out.println("Noahs annual salary- " + noah.getAnnualSalary());
	}
}
