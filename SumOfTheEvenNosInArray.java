package com.Xworkz.LoopingStatement;

public class SumOfTheEvenNosInArray {
	public static void main(String[] args){
		System.out.println("Begining");
		int numbers[]= {10,15,20,21,30,33,40};
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				sum=sum+numbers[i];	
				}
			}
		System.out.println(" Sum Of Even Nos in Array are : "+sum);
		System.out.println("Ending");
		}
	}


