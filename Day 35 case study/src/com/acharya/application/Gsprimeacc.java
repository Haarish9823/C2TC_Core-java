package com.acharya.application;

import com.acharya.framework.Primeacc;

public class Gsprimeacc extends Primeacc {
	private static final float charges = 50.0f;
	
	public Gsprimeacc(int accno, String accNm, float charges, boolean isprime) {
		super(accno, accNm, charges, isprime);
		
	}
	
 public void bookproduct(float charges) {
	 System.out.println("Dear prime user,your product charges are: "+ charges);
}

@Override
public String toString() {
	return "Gsprimeacc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ "]";
}



}