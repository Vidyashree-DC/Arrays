package com.Xworkz.LoopingStatement;

public class IndexValueOfEvenNos {
	public static void main(String[] args){
		System.out.println("Begining");
		int numbers[]= {10,15,20,25,30,35,41,55,};
		System.out.println(" Index Value of Even Nos are : ");
		for(int i=0;i<numbers.length;i++) {
			System.out.println("Index Value"+i);
			if(numbers[i]%2==0) {
		System.out.println(numbers[i]);
			}
		}
		System.out.println("Ending");
	}
}
