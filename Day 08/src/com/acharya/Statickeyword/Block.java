package com.acharya.Statickeyword;
class Student2{
	int rollno;
	String name;
	static String College = "Acharya";
	
	public Student2(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
		
	}
	static void change() {
		College = "AIT";
	}
	void display() {
		System.out.println(rollno +" "+ name + " "+College);
	}
}
public class Block {

	public static void main(String[] args) {
		Student2 s1 = new Student2(111,"Raghu");
		Student2 s2 = new Student2(222,"Nischay");
		
		s1.display();
		s2.display();
		

	}

}
