package com.acharya.assignment;

public class Test11 {

	public static void main(String[] args) {
		for(int i = 0; i<= 2; i++) 
		{
			for (int j = i; j<=5; j++)
			{
			if(j == 4) 
			{ 
			continue; 
			}
			System.out.println(j); 
	}
		}
	}
}
// output
// 0
// 1
// 2
// 3
// 5 
// 1
// 2
// 3
// 5
// 2
// 3
// 5
