package com.masai.day7.question2;

public class DayScholar extends Student{
	   double transportFee;

		public DayScholar() {
			// TODO Auto-generated constructor stub
		}
		
		public double getTransportFee() {
			return transportFee;
		}

		public void setTransportFee(double transportFee) {
			this.transportFee = transportFee;
		}

		public DayScholar(double transportFee) {
			this.transportFee = transportFee;
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