package com.acharya.inheritance;
class A {
	void methodA()
	{
		System.out.println("Method of class A");
	}
}
class B extends A {
	void methodB()
	{
		System.out.println("Method of class B");
	}
}
class C extends B{
	void methodC()
	{
		System.out.println("Method of class c");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		B obj1 = new B();
		C obj2 = new C();
		obj1.methodA();
		obj2.methodC();

	}

}
//output
//Method of class A
//Method of class c