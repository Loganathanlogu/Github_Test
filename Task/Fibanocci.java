package com.Task;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		
		int num1=0,num2=1,num3;
		
		for(int i=1;i<=10;i++) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.println(num3);
			
		
		}
//		Scanner sc = new Scanner(System.in);
//		int num1=0;
//		int num2=1;
//		int  n=sc.nextInt();
//		int num3;
//		
//		for(int i=0;i<n;i++) {
//		
//			num3=num1+num2;
//		    num1=num2;
//		    num2=num3;
//			System.out.println(num3);
//		}
		

	}

}
