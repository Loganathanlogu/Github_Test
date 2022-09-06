package com.Test1.program;

import java.util.Scanner;

public class countvalue {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String:");
		String name=in.nextLine();
		for(char c='a';c<='z';c++) {
			int count=0;
			for(int i=0;i<name.length();i++) {
			
				if(name.charAt(i)==c) {
					count++;
				}
				}
			if(count!=0) {
				System.out.println(c+"--->"+count);
			}
		}

	}	

}