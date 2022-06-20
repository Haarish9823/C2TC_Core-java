package com.acharya.string;

public class Test8 {

	public static void main(String[] args) {
		String s1 = "Welcome to Jumanji";
		char[] ch = s1.toCharArray();
		int len = ch.length;
		System.out.println(len);
		for (int i = 0; i < len; i++) {
		System.out.print(ch[i]);
		}
	}

}
//output
//18
//Welcome to Jumanji