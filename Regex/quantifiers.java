package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class quantifiers {

	public static void main(String[] args) {
//Quantifiers  +,*,?,{}
		String s ="abaabbaaabababaaaabbb";
		Pattern p = Pattern.compile("a+");//+ means At least one match
		Matcher m= p.matcher(s);
		while(m.find()) {
			System.out.println(m.group()+" Starts at "+ m.start());
		}
		
		System.out.println("******  *******");
		Pattern p1 = Pattern.compile("b*");//* any number of match include zero
		Matcher m1= p1.matcher(s);
		while(m1.find()) {
			System.out.println(m1.group()+" Starts at "+ m1.start());
		}
		
		Pattern p2 = Pattern.compile("b{1,3}");//{} any number of match include zero
		Matcher m2= p2.matcher(s);
		while(m2.find()) {
			System.out.println(m2.group()+" Starts at "+ m2.start());
		}

	}

}
