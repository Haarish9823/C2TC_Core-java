package com.acharya.interf;
interface Inf1
{
public void method1();
}
public class Example1 implements Inf1 {
	public void method1()
	{
	System.out.println("method1");
	}
	public static void main(String[] args) {
		Example1 obj = new Example1();
		obj.method1();

	}
}
// output method1