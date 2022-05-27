package com.masai.day8.question2;

//ClassCastException occurs when we try to typecast objects of different classes
//which don't have a relationship.
//
//Object typecasting can be achieved only if-
//1) a parent class object has a reference to the child class object (upcasting)
//
//2) a parent class object has a reference to the child class object, then, it can be 
//downcasted to the child class object explicitly. (downcasting).
//
//ex.

//public class A
//{
//	void funA()
//	{
//		System.out.println("from func A");
//	}
//}
//
//public class B extends A
//{
//	void funB()
//	{
//		System.out.println("from func B");
//	}
//}
//
//public class C extends C
//{
//	void funC()
//	{
//		System.out.println("from func C");
//	}
//}
//
//public class ClassCastException {
//	public static void main(String[] args){
//		A a = new A();
//		A b = new B();
//		A c = new C();
//		
//		a.funcA();
//		b.funB(); //error because the variable b is of type class A, so it will not have the access to the methods of class B.
//				  //to run this method, we need to downcast.
//		B b1 = (B)b;
//		
//		B b2 = (B)a; //ClassCastException
//					 //As a does not have a reference to the object of class B, we cannot downcast it;
//					 
//		C c1 = (C)b; //ClassCastException
//	}
//}