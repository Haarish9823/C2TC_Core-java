package com.acharya.abstraction;

import java.util.Scanner;

abstract class Movie{
	String title;
	abstract void setTitle(String s);
}
class Mymovie extends Movie{
	void setTitle(String s) {
		title = s;
	}
	String getTitle() {
		return title;
	}
}
public class Demo3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String title = s.nextLine();
		Mymovie m = new Mymovie();
		m.setTitle(title);
		System.out.println("The title is "+m.getTitle());
		

	}

}
