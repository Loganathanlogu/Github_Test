package com.Collections.Set;



import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetProgram {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<Integer>();
		
		t.add(3);
		t.add(2);
		t.add(5);
		t.add(8);
		t.add(1);
		t.add(7);
		
		System.out.println(t);
		System.out.println();
		
	Iterator<Integer> it=t.iterator();

	it =t.descendingIterator();
	System.out.println("Descending order:");
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	
	System.out.println("Another method of Descending :"+t.descendingSet());
	
	System.out.println("Lowest element of the set is:"+t.first());
	System.out.println(t);
	
	int value = t.floor(10);
	System.out.println("The floor value :"+value);

	
	int n=t.size();
	int[] array = new int[n];
	int i=0;
	for(int element : t) {
		array[i++]=element;
	}
	System.out.println("Print the Index of 4 is :"+array[4]);
	
	

		



	}

}
