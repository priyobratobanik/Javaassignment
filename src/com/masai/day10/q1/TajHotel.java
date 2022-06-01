package com.masai.day10.q1;

public class TajHotel implements Hotel {
	public void welcomeDrink() {
		System.out.println("welcome Drink from the TajHotel");
	}

	@Override
	public void chickenBiryani() {
		// TODO Auto-generated method stub
		System.out.println("Chicken Biryani from Taj");
	}

	@Override
	public void masalaDosa() {
		// TODO Auto-generated method stub
		System.out.println("Masala Dosa from Taj");
		
	}
}
