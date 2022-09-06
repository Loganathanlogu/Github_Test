package com.Task;

import java.util.Scanner;

public class NumbeerPalindrome {

	public static void main(String[] args) {
		int num=3555;
		int result=0,remain;
		int orignal=num;
		while(num!=0) {
			remain=num%10;
			result=result*10+remain;
			num/=10;
			
		}
		if(orignal==result) {
			System.out.println(orignal+"is Palindrome");
		}else {
			System.out.println(orignal+"is not Palindrome");
		}
	}

}
