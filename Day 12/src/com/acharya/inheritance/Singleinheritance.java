package com.acharya.inheritance;
class Carnivores {
	void eat()
	{
		System.out.println(".Eating.");
	}
}
class Tiger extends Carnivores {
	void Roar()
	{
		System.out.println(".Roaring.");
	}
}
public class Singleinheritance {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.Roar();
		t.eat();
		

	}

}
//output
//.Roaring.
//.Eating.