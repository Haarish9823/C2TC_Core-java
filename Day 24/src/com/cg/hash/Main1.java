package com.cg.hash;

import java.util.HashSet;

public class Main1 {

	public static void main(String[] args) {
		HashSet obj=new HashSet();
		obj.add(5);
		obj.add("Vowels");
		obj.add(null);
		obj.add(90.98);
		System.out.println(obj);
	}

}
//[null, 5, Vowels, 90.98]
