package com.masai.day7.question1;

public class Main{
	
	public static void main(String[] args) {
		Member m1 = new Member();
	
		Employee e1 = new Employee();
		
		e1.setName("Priyo");
		e1.setAge(23);
		e1.setPhone_number("6294227253");
		e1.setAddress("kolkata");
		e1.setSalary(50000.0);
		e1.setSpecialisation("java");
		e1.setDepartment("SDE-1");
		e1.printDetails();
		e1.printSalary();
		
		Manager m2 = new Manager();
		e1.setName("Priyobrato Bnaik");
		e1.setAge(23);
		e1.setPhone_number("7407814231");
		e1.setAddress("Alipurduar");
		e1.setSalary(100000.0);
		e1.setSpecialisation("java tech manager");
		e1.setDepartment("Manager");
		e1.printDetails();
		e1.printSalary();
		
	}
}
