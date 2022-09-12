package com.OOPs;

interface Friends1{
	
	void Kamal(int a);
	void Mathu(int a);
	void Logu(int a);
	
	
	default void Bupathi() {
		System.out.println("Bupathi is Studying Software Testing");
	}

	
}
interface Frinds2{
	
	void Vishnu(int a);
	void Dheena(int a);
	void Ajith(int a);
}

abstract class Java{
   	int  number;
	Java(){//constructor
		System.out.println("Java is Populor Programming Language...");
	}
	abstract void Developer();
	
	public void Fita() {
		System.out.println("We are Study Java in Fita Academy");
	}
	
	
}
class Trainer extends Java implements Friends1,Frinds2{

	
	void Developer() {
		
		System.out.println("We are the future Java Devoloper");
	}

	@Override
	public void Vishnu(int age) {
		
		number =6;

		System.out.println(number+ " -- "+"Vishnu"+" Age :"+ age);
		
	}

	@Override
	public void Dheena(int age) {
		number =2;
		System.out.println(number+" -- "+"Dheena"+" Age: "+age);
		
	}

	@Override
	public void Ajith(int age) {
		number = 1;
		System.out.println(number+" -- "+"Ajith"+" Age: "+age);
		
	}

	@Override
	
	public void Kamal(int age) {
		number =3;
		System.out.println(number+" -- "+"Kamal"+" Age:"+age);
		
	}

	@Override
	public void Mathu(int age) {
		number=5;
		System.out.println(number+" -- "+"Mathu"+" Age:"+age);
		
	}

	@Override
	public void Logu(int age) {
		number=004;
		System.out.println(number+" -- "+"Logu"+" Age:"+age);
		
	}
	public void Trainer() {
		System.out.println("Shyam is our java Trainer");
	}
	
}

public class AbsractAndInterface {

	public static void main(String[] args) {
		Trainer t = new Trainer();
		t.Developer();
		t.Ajith(20);
		t.Dheena(21);
		t.Kamal(20);
		t.Logu(21);
		t.Mathu(21);
		t.Vishnu(20);
		t.Bupathi();
		t.Fita();
		t.Trainer();
		

	}

}
