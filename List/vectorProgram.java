package com.Collections.List;


import java.util.Vector;

public class vectorProgram {

	public static void main(String[] args) {

		int n = 5;
		Vector<Integer> vs= new Vector<>(n);
	
		
		for(int i=1;i<=n;i++) {
			vs.add(i);	
		}
		System.out.println(vs);
		


		for(int str : vs) {
	
		
		System.out.println(str);

		}
	}

}
