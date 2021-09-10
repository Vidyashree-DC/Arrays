package com.Xworkz.LoopingStatement;

public class SumOfEvenIndexInArray {
	public static void main(String[] args) {
		System.out.println("Begining");
		int numbers[]= {10,20,30,40,45,55,53,60};
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			if(i%2==0) {
				sum=sum+numbers[i];
				}
			}
		System.out.println(" Sum Of Odd Index Nos in Array are : "+sum);
		System.out.println("Ending");

	}
}
