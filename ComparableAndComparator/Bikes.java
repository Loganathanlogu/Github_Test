package com.Collections.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Bikes implements Comparable<Bikes> {
	String model;
	int price;
	String company;
	String color;

	@Override
	public int compareTo(Bikes b) {
		
		return (this.color.compareTo(b.color)  );
	}

	Bikes(String model,int price,String company,String color){
		this.color=color;
		this.company=company;
		this.price=price;
		this.model=model;
	}
	

	private String getModel() {
		return model;
	}

	private void setModel(String model) {
		this.model = model;
	}

	private int getPrice() {
		return price;
	}

	private void setPrice(int price) {
		this.price = price;
	}

	private String getCompany() {
		return company;
	}

	private void setCompany(String company) {
		this.company = company;
	}

	private String getColor() {
		return color;
	}

	private void setColor(String color) {
		this.color = color;
	}

	public static void main(String[] args) {

		ArrayList<Bikes> bs= new ArrayList<Bikes>();

	
		bs.add(new Bikes("BMW-g10r", 320000, "BMW", "Red"));
		bs.add(new Bikes("Kawasiki-z900", 900000, "Kawasiki", "Green"));
		bs.add(new Bikes("MT-15", 160000, "Yamaha", "Black"));
		bs.add(new Bikes("Apachi-200", 150000, "Apachi", "White"));
		
		Collections.sort(bs);
		for(Bikes bike : bs) {
			System.out.print(bike.getModel()+" ");
			System.out.print(bike.getCompany()+" ");
			System.out.print(bike.getColor()+" ");
			System.out.print(bike.getPrice()+"\n ");

		}
		
 

	}



	



}
