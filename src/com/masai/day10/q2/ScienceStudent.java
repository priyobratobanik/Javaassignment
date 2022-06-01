package com.masai.day10.q2;

public class ScienceStudent extends Student {
	
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	ScienceStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	void getPercentage() {
		// TODO Auto-generated method stub
		//super.getPercentage();
		int total=getPhysicsMarks()+getChemistryMarks()+getMathsMarks();
		int result=(total/300)*100;
		System.out.println(result);
	}


	public int getPhysicsMarks() {
		return physicsMarks;
	}


	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}


	public int getChemistryMarks() {
		return chemistryMarks;
	}


	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}


	public int getMathsMarks() {
		return mathsMarks;
	}


	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

}
