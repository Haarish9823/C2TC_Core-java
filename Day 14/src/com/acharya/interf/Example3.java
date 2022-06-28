package com.acharya.interf;
interface Sayable{
	default void say() {
		System.out.println("Hello, this is default method");
	}
	void sayMore(String msg);
}
public class Example3 implements Sayable{
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		Example3 dm = new Example3();
		dm.say();
		dm.sayMore("Work is workship");
	}
}
//output
//Hello, this is default method
//Work is workship