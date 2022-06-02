package com.masai.day11.q1;

public interface Y {
	void methodY1();
	public default void methodY2() {
		System.out.println("method Y2 in interface Y");
	}
	static void methodY3() {
		System.out.println("method Y3 in interface Y");
	}

}
