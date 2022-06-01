package com.masai.day10.q1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		if(amount>=1000) {
			Hotel h1=new TajHotel();
			return h1;
		}
		else if(amount>=200 && amount<=1000) {
			Hotel h1=new RoadSideHotel();
			return h1;
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the amount");
		int a=sc.nextInt();
		
		Demo demo=new Demo();
		demo.provideFood(a);
		
		if(demo.provideFood(a)instanceof TajHotel) {
			
			Hotel hotel=new TajHotel();//Upcasting
			//31- I will get the members of the Hotel class and 
			// I will get the @Overriden methods in the Child(Taj) class.
			
			
			
			TajHotel t1=(TajHotel) hotel;//Downcasting
			//34- Here we are basically downcasting line 31 to get the child class
			//object so that we can access the properties which are original for the
			//child class.
			hotel.chickenBiryani();
			hotel.masalaDosa();
			t1.welcomeDrink();
			
			
		}
		else if(demo.provideFood(a)instanceof RoadSideHotel) {
			Hotel hotel=new RoadSideHotel();
			hotel.chickenBiryani();
			hotel.masalaDosa();
			
		}
		else {
			System.out.println("enter a valid number");
		}
		
		
		

	}

}
