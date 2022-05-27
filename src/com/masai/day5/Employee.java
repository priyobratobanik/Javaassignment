package com.masai.day5;
import java.util.Scanner;
/*
Create a class Employee as Java Bean class with the following private member
variables.
int employeeId
String employeeName
double salary
double netSalary

Write the following method in the Employee class: public void calculateNetSalary(int
pfpercentage)  - This method should take PF percentage as argument. Deduct the PF
amount from the salary and set the netSalary

Create a Main class which has the main method which invokes the method to get the
input and prints the details as shown in the sample.

Also write a method :
public static Employee getEmployeeDetails() -  which gets the employee details - id,
name and salary from the user and returns the employee object.

public static int getPFPercentage() -  which gets the PF percentage and returns the
same

In the main method invoke the above two methods, and then call the calculateNetSalary
method in Employee class and print the output as shown below.

Sample Input 1:
Enter Id: 101 Enter Name: Vivek Enter salary: 20000 Enter PF percentage: 7
Sample Output 1:
Id : 101
Name : Vivek
Salary : 20000.0
Net Salary : 18600.0
*/

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private double netSalary;
	
	
	public Employee() {

	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public Employee(int employeeId, String employeeName, double salary, double netSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.netSalary = netSalary;
	}
	
	public void calculateNetSalary(int pfpercentage) {
		this.netSalary = this.salary/100*(100-pfpercentage);
		return;
	}
	public static Employee getEmployeeDetails() {
		Employee e1 = new Employee(101,"vivek",20000.0,18400.0);
		return e1;
	}
	
	public static int getPFPercentage(int pfpercentage) {
		return pfpercentage;
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Id");
		e.setEmployeeId(scanner.nextInt());
		
		System.out.println("Enter Name");
		e.setEmployeeName(scanner.next());

		
		System.out.println("Enter salary");
		e.setSalary(scanner.nextDouble());
		
		
		System.out.println("Enter PF percentage");
		e.calculateNetSalary(e.getPFPercentage(scanner.nextInt()));
		
		System.out.println("Id: "+e.getEmployeeId());
		System.out.println("Name: "+e.getEmployeeName());
		System.out.println("Salary: "+e.getSalary());
		System.out.println("Net Salary: "+e.netSalary);
	}
}






