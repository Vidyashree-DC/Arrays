package com.Xworkz.LoopingStatement;

public class SumOfTheArrayElements {
	public static void main(String[] args){
		System.out.println("Begining");
		int numbers[]= {10,15,20,25,30,35,41,55,};
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
		System.out.println(" Sum Of Array Nos are : "+sum);
		System.out.println("Ending");
	}
}
