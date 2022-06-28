package com.acharya.polymorphism;
public class Test5{
	int id;
	String name;
	int age;
	Test5(int i,String n){
		id = i;
		name = n;
	}
	Test5(int i,String n ,int a){
		id = i;
		name = n;
		age = a;
	}

void display()
{
	System.out.println(id+" "+name+" "+age);
}

	public static void main(String[] args) {
	Test5 s1 = new Test5(111,"Karan");
	Test5 s2 = new Test5(222,"Aryan",25);
	s1.display();
	s2.display();

	}}
//output 
// 111 Karan 0
// 222 Aryan 25

