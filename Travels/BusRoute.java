package com.Tavels;

interface BusRoute {
	
	void Route1();
	void Route2();
	void Route3();
	void Route4();
	
	

}
interface BusTime{
	void Time1();
	void Time2();
	void Time3();
	void Time4();
	
	
}
class RouteAndTime implements BusRoute,BusTime{
	
	RouteAndTime(){
		System.out.println("Welcome To Sundhara Travels");
	}
	@Override
	public void Route1() {

		System.out.println("1.Erode To Coimbatore");
	}

	@Override
	public void Route2() {
		System.out.println("2.Coimbatore To Erode");
		
	}

	@Override
	public void Route3() {
		System.out.println("3.Kangayam To Coimbatore");
		
	}

	@Override
	public void Route4() {
		System.out.println("4.Coimbatore To Kangayam");
		
	}

	@Override
	public void Time1() {
		System.out.println("Start Time : 12:15PM And Reach Time : 2:20Pm");
		
	}

	@Override
	public void Time2() {
		System.out.println("Start Time : 10:00 AM And Reach Time : 12:00Pm");
		
		
	}

	@Override
	public void Time3() {
		System.out.println("Start Time : 11:20AM And Reach Time : 2:00Pm");
		
	}

	@Override
	public void Time4() {
		System.out.println("Start Time: 2:30Pm And Reach Time: 5:30Pm");
		
	}

	
	
	
}

