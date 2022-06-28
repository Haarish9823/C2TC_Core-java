package com.acharya.abstraction;
 abstract class dress
{
	abstract void type();
}
class menswear extends dress
{
	void type()
	{
		System.out.println("It's a Men's wear");
	}
}
public class Demo2 {
	public static void main(String[] args) {
		menswear coat = new menswear();
		coat.type();

	}

}
