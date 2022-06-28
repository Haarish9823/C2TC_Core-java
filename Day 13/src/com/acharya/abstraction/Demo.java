package com.acharya.abstraction;
abstract class Bank{
	abstract int rateofinterest();
}
class SBI extends Bank{
	int rateofinterest() {
		return 7;
	}
}
class HDFC extends Bank{
	int rateofinterest() {
		return 8;
	}
}
public class Demo {
	public static void main(String[] args) {
		SBI s = new SBI();
		HDFC h = new HDFC();
		h.rateofinterest();
		System.out.println("The rate of interest in SBI"+s.rateofinterest());
		System.out.println("The rate of interest in HDFC"+h.rateofinterest());

	}

}
