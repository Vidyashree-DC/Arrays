package com.Xworkz.LoopingStatement;

public class NoDivisibleBy2And3 {

	public static void main(String[] args) {
		System.out.println("Begining");
		int numbers[]= {10,20,30,40,45,55,53,60};
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2==0 && numbers[i]%3==0) {
				System.out.println(" No which can be divisableby 2 AND 3 are : ");
				System.out.println(numbers[i]);
				}
			}
		System.out.println("Ending");
	}

}
