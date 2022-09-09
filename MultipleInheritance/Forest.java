package com.OOPs.MultipleInheritance;

class Forest1 implements Animal,Birds,Trees{

	@Override
	public void Mango() {
		System.out.println("Mango is our national Furite");		
	}

	@Override
	public void Peacock() {
		System.out.println("Peacock is our national Furite");		
		
	}

	@Override
	public void Lion() {

		System.out.println("Lion is the King Of Forest");	
	}

	@Override
	public void Tiger() {
		System.out.println("Tiger is our national Furite");		
		
	}

	@Override
	public void cheetah() {
		System.out.println("Cheetah is Fastest Animal in the world");
		
	}
	
}
public class Forest{

	public static void main(String[] args) {
		Forest1 f1 =  new Forest1();
		f1.Lion();
		f1.cheetah();
		f1.Tiger();
		f1.Peacock();
		f1.Mango();

	}

}
