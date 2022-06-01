package com.masai.day10.q2;

public class HistoryStudent extends Student{
	
	int historyMarks;
	public int getHistoryMarks() {
		return historyMarks;
	}


	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}


	public int getCivicsMarks() {
		return civicsMarks;
	}

	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}


	int civicsMarks;
	
	
	
	HistoryStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void getPercentage() {
		// TODO Auto-generated method stub
		//super.getPercentage();
		int total=getHistoryMarks()+getCivicsMarks();
		int result=(total/200)*100;
		System.out.println("result is: "+result);
	}

}
