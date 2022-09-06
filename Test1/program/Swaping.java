package com.Test1.program;

import java.util.Scanner;

public class Swaping {

	public static void main(String[] args) {
		//Swap program int method and String 
		Scanner in= new Scanner(System.in);
	/*	System.out.println("Enter first number:");
	   int a=in.nextInt();
	   System.out.println("Enter second number:");
	   int b= in.nextInt();
	   System.out.println("Before swap:");
	   System.out.println("a="+a+" "+"b="+b);
	   a=a*b;
	   b=a/b;
	   a=a/b;
	   System.out.println("After swap:");
	   System.out.print("a="+a+" "+"b="+b);*/
	
	   String  name=in.nextLine();
	   String name1=in.nextLine();
	   System.out.println("Before Swap:");
	   System.out.println("name="+ name +" name1= "+ name1);
	   String name2=name+name1;
	  System.out.println("After Swap:");
	  System.out.println("name:"+name2.substring(4, 9));
		  
		   System.out.println("name1:"+name2.substring(0, 4));
		
	   
		}
	}
	
