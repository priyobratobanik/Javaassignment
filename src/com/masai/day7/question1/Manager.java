package com.masai.day7.question1;

public class Manager extends Member{
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
		System.out.println("Manager Salary: "+ Salary);
	}
	void printDetails() {
		System.out.println("Manager Name: "+Name);
		System.out.println("Manager age: "+Age);
		System.out.println("Manager Phone number: "+Phone_number);
		System.out.println("Manager Address: "+Address);
		System.out.println("Manager Specialisation: "+Specialisation);
		System.out.println("Manager Department: "+Department);
	}
}
