package com.Collections.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class HashSetandLinkedSet {

	public static void main(String[] args) {


		HashSet<String> hs = new HashSet<String>();
		LinkedHashSet<Integer> ls = new LinkedHashSet<>();
	
		
		Collections.addAll(hs, "Logu","Dheena","Kamal","Booth","Aijth");
		
		
		System.out.println(hs.contains("Logu"));
		System.out.println(hs.size());
		System.out.println(hs);
		
		
		Collections.addAll(ls, 1,2,3,4,5,6);
		
		System.out.println(ls);
		System.out.println(ls.containsAll(ls));
		System.out.println(ls.size());
		System.out.println(ls.clone());
		
		
		
	}
	

}
