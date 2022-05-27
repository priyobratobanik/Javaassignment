package com.masai.day6;

import java.util.Scanner;

public class Main {
	public static String reversString(String input){
		  char []cha = input.toCharArray();
		  StringBuilder str = new StringBuilder("");
		  for(int i = cha.length-1; i>=0; i--) {
			  str.append(cha[i]);
		  }
		  
		  String reverse = str.toString();
		  return reverse;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
	}
}
