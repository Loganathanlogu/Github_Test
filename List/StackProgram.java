package com.Collections.List;

import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
	
		Stack<String> s = new Stack<>();
		s.push("Logu");
		s.push("kamal");
		s.push("Mathu");
		s.push("Dheena");
		s.push("boopathi");
		
		s.set(3, "Ajith");
		
		for(String str : s) {
		System.out.println(str);
	}
		
	}

}
