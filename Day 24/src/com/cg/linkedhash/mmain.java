package com.cg.linkedhash;

import java.util.LinkedHashSet;

public class mmain {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Apple");
		set.add("Orange");
		set.add("Banana");
		set.add("Apple");
		set.add("Lemon");
		System.out.println("The LinkedHashSet:" +set);
		Object[] arr = set.toArray();
		System.out.println("The array is:");
		for (int j = 0; j < arr.length; j++)
		System.out.println(arr[j]);
	}

}
//The LinkedHashSet:[Apple, Orange, Banana, Lemon]
//The array is:
//Apple
//Orange
//Banana
//Lemon
