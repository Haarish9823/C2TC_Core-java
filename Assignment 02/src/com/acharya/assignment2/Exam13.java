package com.acharya.assignment2;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		System.out.println("enter the elements");
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a.length;j++)
			{
		a[i][j]=sc.nextInt();
		}}
		for(int i=0; i<a.length;i++)
		{
		for(int j=0; j<a.length;j++)
		{
		System.out.print(a[i][j] + " ");
		}
		System.out.println();
		}
		for(int i=0; i<a.length;i++)
		{
		int t=a[0][i];
		a[0][i]=a[2][i];
		a[2][i]=t;
		}
		System.out.println("matrix after swapping ");
		for(int i=0; i<a.length;i++)
		{
		for(int j=0; j<a.length;j++)
		{
		System.out.print(a[i][j] + " ");
		}
		System.out.println();
		}
	}
}
