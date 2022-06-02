package com.masai.day11.q1;

public interface X {

	void methodX1();
	public default void methodX2() {
		System.out.println("method X2 in interface X");
	}
	static void methodX3() {
		System.out.println("method X3 in interface X");
	}
}
