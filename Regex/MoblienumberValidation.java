package com.Regex;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoblienumberValidation {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E:\\Files\\sample\\logu.txt");
		Scanner sc= new Scanner(file);
		while(sc.hasNext()) {
		String word=sc.next();
		int i=word.indexOf(":");
		String number=word.substring(i+1);
		Pattern p= Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m=p.matcher(number);
		if(m.find()) {
			System.out.println(m.group()+" is valid Moblie Number");
		}
		else {
			System.out.println(number+" is not a valid Mobile Number");
		}
		
			
		}
		
		
	}

}
