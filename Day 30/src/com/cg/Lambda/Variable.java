package com.cg.Lambda;
interface Drawable{
	public void draw(int radius);
}
public class Variable {

	public static void main(String[] args) {
		Drawable d2=(int radius)->{
			System.out.println("Draw a circle with radius of "+ radius);
		};
		d2.draw(10);
		

	}

}
// Draw a circle with radius of 10