package com.acharya.application;

import com.acharya.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	 public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
			super(accNo, accNm, accBal, creditLimit );
		}

	public void withdraw (float creditLimit) {
		 System.out.println("Dear Ramesh,your current account withdraw charges:" +getAccBal()+ "and Credit limit is :" + creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getCreditLimit()=" + getCreditLimit() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	 
}
