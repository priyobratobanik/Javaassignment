package com.masai.day7.question2;

public class Student {
	int studId;
	String studName;
	double examFee;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int studId, String studName, double examFee) {
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public double getExamFee() {
		return examFee;
	}
	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	
	public void displayDetails() {
		System.out.println("Student Id: " + this.getStudId());
		System.out.println("Student Name: " + this.getStudName());
		System.out.println("Student Exam Fee: " + this.getExamFee());
	}
	public double payFee(double ammount) {
		double remainAmmount = this.getExamFee() - ammount;
		return remainAmmount;
	}
	
}