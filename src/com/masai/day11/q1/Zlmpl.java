package com.masai.day11.q1;

public  class Zlmpl implements Z{

	@Override
	public void methodX1() {
		// TODO Auto-generated method stub
		System.out.println("method X1 in class Zlmpl");
		
	}

	@Override
	public void methodY1() {
		// TODO Auto-generated method stub
		System.out.println("method Y1 in class Zlmpl");
	}

	@Override
	public void methodZ() {
		// TODO Auto-generated method stub
		System.out.println("method Z in class Zlmpl");
		
	}
	
	@Override
	public void methodX2() {
		// TODO Auto-generated method stub
		Z.super.methodX2();
	}

}
