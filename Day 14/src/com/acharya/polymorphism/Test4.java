package com.acharya.polymorphism;
class Bank{
	int getRateofinterest() {return 0;}
}
class SBI extends Bank{
	int getRateofinterest() {return 8;}
}
class ICICI extends Bank{
	int getRateofinterest() {return 7;}
}
class AXIS extends Bank{
	int getRateofinterest() {return 9;}
}
public class Test4 {
	public static void main(String[] args) {
		SBI s=new SBI();
		ICICI i = new ICICI();
		AXIS a = new AXIS();
		System.out.println("SBI Rate of interest: "+s.getRateofinterest());
		System.out.println("ICICI Rate of interest: "+i.getRateofinterest());
		System.out.println("AXIS Rate of interest: "+a.getRateofinterest());
	}
}
//output
// SBI Rate of interest: 8
// ICICI Rate of interest: 7
// AXIS Rate of interest: 9
