package com.masai.day2;

public class Cricketsc {

	void findScore(int a, int b, int c, int d, int e) {
		
		int score = 1*a+ 2*b+ 3*c+ 4*d+ 5*e;
		System.out.println(score);
		
	}
	
	public static void main(String[] args) {
		 Cricketsc x = new  Cricketsc();
		x.findScore(10, 8, 6, 4, 2);
	}

}
