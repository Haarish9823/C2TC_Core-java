package com.acharya.abstraction;
abstract class Bike{
	 abstract void run();
	 }
class Honda extends Bike{
	 void run() {
		 System.out.println("Running safetly");
	 }
}
public class Main1 {

	public static void main(String[] args) {
		Honda h = new Honda();
		h.run();

	}

}
