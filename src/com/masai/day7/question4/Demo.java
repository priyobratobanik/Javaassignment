package com.masai.day7.question4;

import java.util.Scanner;

public class Demo {
	public static Bank getBank(String bank) {
		if(bank.equals("axis")) {
			AxisBank b1 = new AxisBank();
			b1.setBranchName("Axis Bank");
			b1.setIfscCode("AXIS012");
			b1.setRateOfInterest(4.5);
			b1.displayDetails();
			b1.getCreditCard();
			return b1;
		}else if(bank.equals("icici")) {
			ICICIBank b2 = new ICICIBank();
			b2.setBranchName("ICICI Bank");
			b2.setIfscCode("ICICI565");
			b2.setRateOfInterest(5.1);
			b2.displayDetails();
			return b2;
		}else return null;
	}
	public static void main(String[] args) {
		//Demo d = new Demo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter axix or icici");
		Bank b = getBank(scanner.next());
		
	}
}