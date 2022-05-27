package com.masai.day7.question4;

public class ICICIBank extends Bank{
	double rateOfInterest;

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	@Override
	void displayDetails() {
		System.out.println("Bank Name: " + this.getBranchName());
		System.out.println("Bank IFCS Code: " + this.getIfscCode());
		System.out.println("Bank Interest Rate: " + this.getRateOfInterest());
	}
}
