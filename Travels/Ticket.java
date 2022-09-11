package com.Tavels;

abstract class Ticket{
	abstract void price1();
	
	abstract void price2();
	

}

class Price extends Ticket{

	@Override
	void price1() {
		System.out.println("Ticket Price: 75 ruppes per person");
		
	}

	@Override
	void price2() {
		System.out.println("Ticket Price: 60 ruppes per person");
		
	}
	
}