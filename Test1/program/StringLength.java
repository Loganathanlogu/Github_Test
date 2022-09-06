package com.Test1.program;

public class StringLength {

	public static void main(String[] args) {
		
		String para="hi i am Loganathan";
		int count=0;
		String[] split=para.split(" ");

		for(int i=0;i<split.length;i++) {
			
				count++;			
		}
		System.out.println(count);
	}

}
