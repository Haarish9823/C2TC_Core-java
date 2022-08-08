package com.acharya.application;

import com.acharya.framework.Normalacc;

public class Gsnormalacc extends Normalacc{
	
 public Gsnormalacc(int accno, String accNm, float charges, float deliveryCharges) {
		super(accno, accNm, charges, deliveryCharges );
	}

 public void bookproduct(float deliverycharges) {
	 System.out.println("Dear normal user,your product charges:"+ getCharges() + "and delivery charge is:" + deliverycharges);
}

@Override
public String toString() {
	return "Gsnormalacc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ "]";
}


}

