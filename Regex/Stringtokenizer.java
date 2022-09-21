package com.Regex;

import java.util.StringTokenizer;

public class Stringtokenizer { 

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Java Program");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("********Method 2*******");
		
		StringTokenizer str= new StringTokenizer("21-09-2022","-");
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
		

System.out.println("********Method 3*******");
		
		StringTokenizer str1= new StringTokenizer("21-09-2022","-",true);
		while(str1.hasMoreTokens()) {
			System.out.println(str1.nextToken());
		}
	}

}
