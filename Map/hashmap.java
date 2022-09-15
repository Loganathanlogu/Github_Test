package com.Collections.Map;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {


		HashMap<Integer, String> Bikes= new HashMap<Integer, String>();
		
		Bikes.put(1, "Ducati");
		Bikes.put(2, "BMW");
		Bikes.put(3, "Yamaha");
		Bikes.put(4, "Enfiled");

System.out.println(Bikes);

System.out.println(Bikes.get(3));
System.out.println(Bikes.remove(2));
System.out.println(Bikes);




		
	}

}
