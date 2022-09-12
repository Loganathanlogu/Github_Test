package com.Collections;

import java.util.Collections;
import java.util.LinkedList;


public class linkedListMethods {

	public static void main(String[] args) {
	LinkedList<String> ls = new LinkedList<String>();
	
		
	Collections.addAll(ls,"vedha","kamelesh","logu","mathu","dheena" );
	Collections.sort(ls);
	ls.addFirst("loga");
	ls.addLast("kamala");
	
	System.out.println(ls.getFirst());
	System.out.println(ls.getLast());
	System.out.println(ls.get(2));
	ls.offerFirst("Bike");
	ls.offerLast("Car");
//	ls.removeFirst();//it remove Bike
//	ls.removeLast();//it remove Car
	
	for(String str : ls) {
		System.out.println(str);
		
	}
	
	

	}

}
