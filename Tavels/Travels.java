package com.Tavels;

import java.util.Scanner;


public class Travels {
	

	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Travels T = new Travels();
		RouteAndTime RT = new RouteAndTime();
		Price P = new Price();
		
	
		RT.Route1();
		RT.Route2();
		RT.Route3();
		RT.Route4();
		System.out.println();
		
		System.out.println("Enter the Route Number:");
		int i =sc.nextInt();
		if(i==1) {
			RT.Route1();
			RT.Time1();
			P.price1();
		}
		
	else if(i==2) {
			RT.Route2();
			RT.Time2();
		P.price1();
		}else if(i==3) {
		RT.Route3();
		RT.Time3();
			P.price2();
	}
	else if(i==4) {
		RT.Route4();
			RT.Time4();
			P.price2();
		}else {
			System.out.println("This Route is not available");
		}
		System.out.println();
		System.out.println("Enter How many tickets do you want?");
		
		int j = sc.nextInt();
		if(i==1|| i==2){
			System.out.println("Your Ticket Price is :");
			System.out.println(j*75);
		}else if(i==3 || i==4) {
			System.out.println("Your Ticket Price is :");
			System.out.println(j*60);
		}else {
			System.out.println("Tickets not available");
		}
		
		System.out.println();
		System.out.println("If you want book tickets then type l:");
		
		String k = sc.nextLine();
		
	   if(k=="l") {
			System.out.println("Your tickets booked  Successesfully");
			  System.out.println("HAPPY JOURNEY!");	
	   }else {
		   System.out.println("Try Again");
	   }
		   
	 
	 	
		
		
		
		
		

	}

}
