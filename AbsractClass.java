package com.OOPs;

abstract class Mobile{
	
	void Voicecall() {
		System.out.println("You can make voice calls");
	}
	abstract void Camera();
	abstract void Display();
	
}
class Vivo extends Mobile{

	@Override
	void Camera() {
		System.out.println("32 Mega Pixel With Popup Camera");
		
	}

	@Override
	void Display() {
		System.out.println("6.6 Full Screen LCD Display");
		
	}
	
}

public class AbsractClass {

	public static void main(String[] args) {
		Vivo v15 = new Vivo();
		System.out.println("Vivo  V15 Model:");
		v15.Camera();
		v15.Display();

	}

}
