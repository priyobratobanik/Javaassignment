package com.masai.day7.question2;

public class Hosteller extends Student{
	double hostelFee;

	public Hosteller() {
		// TODO Auto-generated constructor stub
	}
	
	public Hosteller(double hostelFee) {
		this.hostelFee = hostelFee;
	}
	
	public double getHostelFee() {
		return hostelFee;
	}

	public void setHostelFee(double hostelFee) {
		this.hostelFee = hostelFee;
	}
	@Override
	public void displayDetails() {
		System.out.println("Student Id: " + this.getStudId());
		System.out.println("Student Name: " + this.getStudName());
		System.out.println("Student Exam Fee: " + this.getExamFee());
	}
	@Override
	public double payFee(double ammount) {
		double remainAmmount = this.getExamFee() - ammount;
		return remainAmmount;
	}
}
