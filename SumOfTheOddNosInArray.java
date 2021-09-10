package com.Xworkz.LoopingStatement;

public class SumOfTheOddNosInArray {
	public static void main(String[] args){
		System.out.println("Begining");
		int numbers[]= {10,20,30,40,45,55,53,60};
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2!=0) {
				sum=sum+numbers[i];	
				}
			}
		System.out.println(" Sum Of Odd Nos in Array are : "+sum);
		System.out.println("Ending");
		}
}
