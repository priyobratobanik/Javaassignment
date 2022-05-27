package com.masai.day7.question1;

public class Employee extends Member{
	
	String Specialisation;
	String Department;
	
	public String getSpecialisation() {
		return Specialisation;
	}
	public void setSpecialisation(String specialisation) {
		Specialisation = specialisation;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	@Override
	void printSalary() {
		System.out.println("Employee Salary: "+ Salary);
	}
	void printDetails() {
		
		System.out.println("Employee Name: "+Name);
		System.out.println("Employee age: "+Age);
		System.out.println("Employee Phone number: "+Phone_number);
		System.out.println("Employee Address: "+Address);
		System.out.println("Employee Specialisation: "+Specialisation);
		System.out.println("Employee Department: "+Department);
	}

}