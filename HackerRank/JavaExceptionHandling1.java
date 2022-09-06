package com.HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling1 {

	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			
		}catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
