package com.masai.day6;

public class CommandLine {
	 public static void main(String [] args) {
			if(args.length==1) {
				int num = Integer.parseInt(args[0]);
				int sum = 1;
				for(int i = 1; i<=num; i++) {
					sum = sum *i; 
				}
				System.out.println(sum);
			}
			if(args.length==2) {
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);
				System.out.println(Math.abs(num1-num2));
			}
			if(args.length>=3) {
				System.out.println("Error");
			}
		}

}
