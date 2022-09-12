package com.Test1.program;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		//Anagram program
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First name:");
		String name1=in.nextLine();
		System.out.println("Enter second name: ");
		String name2=in.nextLine();
		if(name1.length()==name2.length());
        char[] ch1 =name1.toCharArray();
        char[] ch2=name2.toCharArray();
        
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
				
		
		
			
		

	

}
	}