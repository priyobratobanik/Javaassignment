package com.masai.day7.question4;

public class Bank {
	String branchName;
	String IfscCode;
	
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return IfscCode;
	}

	public void setIfscCode(String ifscCode) {
		IfscCode = ifscCode;
	}

	void displayDetails() {
		System.out.println("Bank Name: " + this.getBranchName());
		System.out.println("Bank IFCS Code: " + this.getIfscCode());
	}
}
