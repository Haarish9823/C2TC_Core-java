package com.acharya.polymorphism;
class Adder
{
	static int add(int a,int b) 
	{
		return 2+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}
public class Test1 {
	public static void main(String[] args) {
		System.out.println(Adder.add(11,11));
		System.out.println(Adder.add(11,11,11));
	}
}
//output
//13
//33
