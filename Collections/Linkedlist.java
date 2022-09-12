package com.Collections;

import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {

    LinkedList<String> Bikes= new LinkedList<String>();
    
    Bikes.add("BMW");
    Bikes.add("Ducati");
    Bikes.add("Yamaha");
    Bikes.add("RoyalEnfiled");
    System.out.println("Before Add: "+Bikes);
    Bikes.add(3, "Hero");
    System.out.println("After Add: "+Bikes);
    
    Bikes.get(1);
    System.out.println("Index at 1: "+Bikes);
    
    Bikes.set(2, "Kawasiki");
    System.out.println("update in index 2: "+Bikes);
    
    Bikes.remove(3);
    System.out.println("Remove index 3: "+Bikes);
    
    
    
    
    

	}

}
