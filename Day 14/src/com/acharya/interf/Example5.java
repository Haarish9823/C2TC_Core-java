package com.acharya.interf;
interface Writeable{
	void writes();
}
interface Readable{
	void reads();
}
public class Example5 implements Readable,Writeable {
	public void reads() {
		System.out.println("Student reads..");
	}
	public void writes() {
		System.out.println("Student writes..");
	}
	public static void main(String[] args) {
		Example5 s = new Example5();
		s.reads();
		s.writes();
	}
}
//output
// Student reads..
// Student writes..
