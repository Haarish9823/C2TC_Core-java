package com.acharya.inheritance;
class Herbivores {
	void eat()
	{
		System.out.println(".Grass.");
	}
}
class Cow extends Herbivores {
	void moo()
	{
		System.out.println(".Mooing.");
	}
}
class Calf extends Cow {
	void weep()
	{
		System.out.println(".Weeping.");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		Calf c = new Calf();
		c.weep();
		c.moo();
		c.eat();

	}

}
//output
//.Weeping.
//.Mooing.
//.Grass.