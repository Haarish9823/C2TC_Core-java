package com.tns.generics;
class Dataa{
	private Object str;

	public Object getStr() {
		return str;
	}

	public Dataa(Object str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "Dataa [str=" + str + ", getStr()=" + getStr() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
public class GenericExample {

	public static void main(String[] args) {
		Dataa obj = new Dataa(3.876666);
		String output =(String) obj.getStr();
		System.out.println(output);

	}

}
