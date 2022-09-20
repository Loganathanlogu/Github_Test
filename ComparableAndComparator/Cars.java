package com.Collections.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cars1{
String color;
String name;
int number;

public Cars1(String name, String color,int number){
	
	this.color=color;
	this.name=name;
	this.number=number;
	
	
}
public String toString() {
	return this.name+" "+this.color+" "+this.number;
	
}
}
class Sortcolor implements Comparator<Cars1>{

	@Override
	public int compare(Cars1 c1, Cars1 c2) {
		
		return c1.color.compareTo(c2.color);
	}
	
	
}
class Sortname implements Comparator<Cars1>{

	@Override
	public int compare(Cars1 c1, Cars1 c2) {
		
		return c1.name.compareTo(c2.name);
	}
	

}



public class Cars {
	

	public static void main(String[] args) {
		
		ArrayList<Cars1> c = new ArrayList<Cars1>();
		c.add(new Cars1("Jaguar","Black",7007));
		c.add(new Cars1("Audi","White",8008));
		c.add(new Cars1("Benz","Red",9009));
		c.add(new Cars1("Rolls","Green",1001));
		
		Collections.sort(c, new Sortname());
		System.out.println("Sort by name : ");
		for(Cars1 s : c) {
			System.out.println(s);
		}
		System.out.println();
		Collections.sort(c, new Sortcolor());
		System.out.println(" Sort by color: ");
		for(Cars1 s : c) {
			System.out.println(s);
		}
		
		

	}
}


