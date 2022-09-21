package com.Regex;

import java.util.regex.Pattern;

public class splitMethod {

	public static void main(String[] args) {
		
		String st ="hhtp://www.google.com ";
		String sentence ="Java is popular language";
		
		String[] s=st.split("\\:|\\//|\\.");
		System.out.println("String Split Method:");
		for(String str : s) {
			System.out.println(str);
		}
			System.out.println("Pattern Split method:");
			Pattern p = Pattern.compile("a");
			String[] S=p.split(sentence);
			for(String str1 : S) {
				System.out.println(str1);
			}
		}
	}


