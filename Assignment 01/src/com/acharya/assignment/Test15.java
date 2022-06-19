package com.acharya.assignment;

public class Test15 {

	public static void main(String[] args) {
		int i=1;
		do
		{
		if(i==5)
		{
		i++; 
		continue;
		}
		System.out.println(i); 
		i++; 
		}
		while(i<=10); 
	}

}
//output
// 1
// 2
// 3
// 4
// 6
// 7
// 8
// 9
// 10