package com.Test1.program;

import java.util.Scanner;

public class test4 {

	

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		String name=in.nextLine();
		System.out.println(name.charAt(5));
		System.out.println(name.replace("t",""));
	}	

}
