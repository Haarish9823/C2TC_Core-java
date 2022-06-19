package com.acharya.assignment;

public class Test6 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++)
		{
		System.out.println("before breaking = " + i );
		if(i == 6)
		break;
		System.out.println("after breaking = " + i );
		}
		System.out.println("for loop terminated.");
	}

}
//output
// before breaking = 1
// after breaking = 1
// before breaking = 2
// after breaking = 2
// before breaking = 3
// after breaking = 3
// before breaking = 4
// after breaking = 4
// before breaking = 5
// after breaking = 5
// before breaking = 6
// for loop terminated.