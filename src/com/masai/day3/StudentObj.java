package com.masai.day3;

public class StudentObj {

	int roll;
	String name;
	int marks;
	
	void displayStudentsDetails(int roll,String name,int marks) {
		
		System.out.println("Roll no is :"+ roll);
		
		System.out.println("Name is :"+ name);
		
		System.out.println("Marks is:"+ marks);

	}
	
	public static void main(String[] args) {
		StudentObj data = new StudentObj();
		data.roll = 4690;
		data.name = "Raj";
		data.marks = 99;
		data.displayStudentsDetails(data.roll,data.name,data.marks);
		
		System.out.println("----------------------------");
		data.roll = 469;
		data.name = "Vibhav";
		data.marks = 100;
		data.displayStudentsDetails(data.roll,data.name,data.marks);
		
		//System.out.println("Garbage done");
	}

}
