package com.masai.day7.question2;


public class Main {
	public static void main(String[] args) {
		Main mn = new Main();
		Student s1 = new Student();
		s1.setStudName("tuhin");
		s1.setStudId(121);
		s1.setExamFee(5000);
		s1.displayDetails();
		System.out.println("remaining amount to be paid: " + s1.payFee(2500));
		System.out.println("**********************************************");
		
		Hosteller h1 = new Hosteller(3000);
		h1.setStudName("tuhin");
		h1.setStudId(11);
		h1.setExamFee(4000);
		h1.displayDetails();
		System.out.println("Hostel fee: "+ h1.getHostelFee());
		System.out.println("remaining amount to be paid: " + h1.payFee(2000));
		System.out.println("**********************************************");
		
		DayScholar d1 = new DayScholar(1000);
		d1.setStudName("tuhin");
		d1.setStudId(110);
		d1.setExamFee(3500);
		d1.displayDetails();
		System.out.println("Hostel fee: "+ d1.getTransportFee());
		System.out.println("remaining amount to be paid: " + d1.payFee(2000));
		System.out.println("**********************************************");
	}
}
