package com.OOPs.MultipleInheritance;

interface Animal {
	void Lion();
	
	void Tiger();
	
	void cheetah();
}

interface Birds extends Animal {
	void Peacock();
	
}
interface Trees extends Birds{
	void Mango();
	
}

