package com.tns.generics;
class Data{
	private int str;

	public int getStr() {
		return str;
	}

	public void setStr(int str) {
		this.str = str;
	}
	public Data(int str) {
		super();
		this.str = str;
	}
}
public class Applications {

	public static void main(String[] args) {
		Data obj = new Data(1);
		System.out.println(obj.getStr());


	}

}
