package com.acharya.assignment2;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[]=new int[a];
		for(int i = 0; i < a; i++)
		{
		arr[i] = sc.nextInt();
		}
		int max = 0;
		for(int i = 0; i < a; i++)
		{
		if(arr[i] > max)
		{
		max = arr[i];
		}
		}
		System.out.print(max);
	}
}
