package com.Xworkz.LoopingStatement;

public class NoDivisibleBy5 {

	public static void main(String[] args) {
		System.out.println("Begining");
		int numbers[]= {10,20,30,40,45,55,53,60};
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%5==0) {
				System.out.println(" No which can be divisableby 5 are : "+numbers[i]);
				}
			}
		System.out.println("Ending");
	}

}
