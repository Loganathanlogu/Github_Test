package com.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternAndMatcher {

	public static void main(String[] args) {


		String s ="Hi, How are you? How is going";
		Pattern p =Pattern.compile("H");
		Matcher m = p.matcher(s);
	
	
		int count=0;
		while(m.find()) {
			count++;
			System.out.println("Strat at "+ m.start()+"  End at "+m.end());
		}
	System.out.println(" the count is :"+count);
		
	boolean p1=Pattern.matches("Hai Hello Fine","Hai Hello ");
	System.out.println(p1);
	}

}
