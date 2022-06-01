package com.masai.day10.q4;

public abstract class Shape {
	
	public int rectangleArea(int length,int breadth) {
		return length*breadth;
	}
	public int squareArea(int side) {
		return side*side;
	}
	
	
	public int circleArea(int radius) {
		
		double pi=3.14;
		int p=(int)pi;
		
		return p*radius*radius;
	}

}
