package com.Test1.program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	//palindrome and Reverse
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
	    int length=name.length();
		String temp="";
		for(int i=name.length()-1;i>=0;i--) 
			
			temp = temp+name.charAt(i);
			
			if(name.equalsIgnoreCase(temp)) 
				System.out.println(name+" is palindrome");
			else 
				System.out.println(name+" is not palindrome");
			
			
			
		
		
	}

}
