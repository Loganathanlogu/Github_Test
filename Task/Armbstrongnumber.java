package com.Task;

import java.util.Scanner;

public class Armbstrongnumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num=sc.nextInt();
	int temp=num;
	int digit1,digit2,digit3;
	digit1=temp%10;
	temp=temp/10;
	
	digit2=temp%10;
	temp=temp/10;
	
	digit3=temp%10;
	int result=(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
	//System.out.println(result);
	if(num==result) {
		System.out.println(num+" is Armstrong");
	}else {
		System.out.println(num + " is not armstrong");
	}

	}

}
