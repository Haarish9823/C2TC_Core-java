package com.acharya.assignment;

public class Test9 {

	public static void main(String[] args) {
		Test9 sc = new Test9(System.in);
		System.out.println("enter the row value: ");
		int n=sc.nextint();
		for(int i=1;i<=n;i++)
		{
		char ch = 'A'; 
		for(int j=1;j<=i;j++)
		System.out.print(ch++);
		System.out.println();
	}

}
}
// error