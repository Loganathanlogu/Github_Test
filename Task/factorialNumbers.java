package com.Task;

import java.util.Scanner;

public class factorialNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Factorial number is:");
		
		int number = scan.nextInt();
		int fact = 1;
		
		for(int i=1;i<=number;i++){
			fact=fact*i;
			
			}
		System.out.println("Factorial is:" +  fact);
	}

}
