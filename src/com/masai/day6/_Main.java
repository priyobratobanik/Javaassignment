package com.masai.day6;

public class _Main {
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
		//determine each element whether it is prime or not
		int[] value = new int[inputArray.length];
		for(int i = 0; i<inputArray.length;i++) {
			if(ifPrime(inputArray[i])) {
				value[i]=inputArray[i];
			}
		}
		return value;
		//create a second array of int
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.

		}
	public boolean ifPrime(int num) {
		int product = 0;
		for(int i = 1; i<=num;i++) {
			if(num%i==0) {
				product++;
			}
		}
		if(product==2) {
			return true;
		}else return false;
	}
	public static void main(String[] args){
		//Create the object of Main class
		_Main prime = new _Main();
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
		int[] arr = {10,12,5,50,11,14,15};
		int [] ans = prime.findAndReturnPrimeNumbers(arr);
		int count = 0;
		for(int i = 0; i<ans.length; i++) {
			if(ans[i]>0) {
				System.out.println(ans[i]);
				count++;
			}
		}
		if(count==0) {
			System.out.println("Prime number not found in the supplied Array");
		}
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
		//message:
		// "Prime number not found in the supplied Array"
	}	
}