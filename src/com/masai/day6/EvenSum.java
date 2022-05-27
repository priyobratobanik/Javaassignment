package com.masai.day6;

public class EvenSum {
	public static void sumEven(int [][] arr) {
		int N = arr.length;
		int M = arr[0].length;
		for(int i = 0; i<N; i++) {
			int sum = 0;
			for(int j = 0; j<M; j++) {
				if(arr[j][i]%2==0) {
					sum += arr[j][i];
				}	
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		int [][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		EvenSum.sumEven(arr);
		//System.out.println(arr[0][2]);
	}

}
