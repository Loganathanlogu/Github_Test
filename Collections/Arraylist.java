package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Arraylist {
	
	 
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		List<String> ls = new ArrayList<String>();
		li.add(1001);
		li.add(1002);
		li.add(1003);
		
		ls.add("Logu");
		ls.add("kamal");
		ls.add("Mathu");
		
		
		li.add(3, 1004);//1.Add Method
		li.add(4, 1005);
		ls.add(3, "Ajith");
		ls.add(4, "vishnu");
		
		
		Collections.addAll(li, 1006,1007,1008,1009);//2.Addall method
		Collections.addAll(ls,"Bupathi","Logesh","Dinesh","Sri");
		Collections.sort(ls);
	
		li.remove(3);//3.remove method
		ls.remove(3);
		
	
		
		
		
		Iterator<Integer> it = li.iterator();
		Iterator<String> it1 =ls.iterator();
		
		
		while(it.hasNext()&&it1.hasNext()) {
			System.out.println(it.next()+"-->"+it1.next());
		}
		int size=li.size();//7.size method
		System.out.println(size);
		int size1=ls.size();
		System.out.println(size1);
		ls.removeAll(li);//4.removeAll Method
		System.out.println(ls);
		ls.clear();//5.clear method
		System.out.println(ls);
		li.retainAll(ls);//6.retainall method
		System.out.println(li);
		
	}

}
