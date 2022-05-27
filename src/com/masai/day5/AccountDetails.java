package com.masai.day5;

import java.util.Scanner;

public class AccountDetails {
	public static void main(String[] args) {
		Account a = new Account();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account id: ");
		a.setAccountId(sc.nextInt());
		
		System.out.println("Enter account type: ");
		a.setAccountType(sc.next());
		
		System.out.println("Enter balance: ");

		a.setBalance(sc.nextInt());
		
		
		System.out.println("Enter amount to be withdrawn: ");
		a.withdraw(sc.nextInt());
	}

}
