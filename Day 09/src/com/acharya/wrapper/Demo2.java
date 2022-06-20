package com.acharya.wrapper;

public class Demo2 {

	public static void main(String[] args) {
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0F;
		double d=60.0D;
		char c='a';
		boolean b2=true;
		Byte byteobj=b;
		Short shortobj=s;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=c;
		Boolean boolobj=b2;
		System.out.println("---Printing object values---");
		System.out.println("Byte object: "+byteobj);
		System.out.println("Short object: "+shortobj);
		System.out.println("Integer object: "+intobj);
		System.out.println("Long object "+longobj);
		System.out.println("Float object "+floatobj);
		System.out.println("Double object "+doubleobj);
		System.out.println("Character object "+charobj);
		System.out.println("Boolean object "+boolobj);
		byte bytevalue=byteobj;
		short shortvalue=shortobj;
		int intvalue=intobj;
		long longvalue=longobj;
		float floatvalue=floatobj;
		double doublevalue=doubleobj;
		char charvalue=charobj;
		boolean boolvalue=boolobj;
		System.out.println("---Printing object values---");
		System.out.println("byte object: "+bytevalue);
		System.out.println("short object: "+shortvalue);
		System.out.println("integer object: "+intvalue);
		System.out.println("long object "+longvalue);
		System.out.println("float object "+floatvalue);
		System.out.println("double object "+doublevalue);
		System.out.println("character object "+charvalue);
		System.out.println("boolean object "+boolvalue);
		
		

	}

}
//output
//---Printing object values---
//Byte object: 10
//Short object: 20
//Integer object: 30
//Long object 40
//Float object 50.0
//Double object 60.0
//Character object a
//Boolean object true
//---Printing object values---
//byte object: 10
//short object: 20
//integer object: 30
//long object 40
//float object 50.0
//double object 60.0
//character object a
//boolean object true
