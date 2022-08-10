package com.tns.generics;
class DataGenerics<T>{
	private T str;

	public T getStr() {
		return str;
	}

	public DataGenerics(T str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "DataGenerics [str=" + str + ", getStr()=" + getStr() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
public class GenericClass {

	public static void main(String[] args) {
		DataGenerics<Character> obj = new DataGenerics<>('c');
		String output =(String)obj.getStr();
		System.out.println(output);

	}

}
