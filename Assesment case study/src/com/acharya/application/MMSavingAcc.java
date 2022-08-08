package com.acharya.application;

import com.acharya.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
private static final float accBal = 50.0f;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		
	}
	
 public void withdraw(float accBal) {
	System.out.println("Dear Santhu,your saving account withdraw charges are:"+ accBal );
}

@Override
public String toString() {
	return "MMSavingAcc [isSalary()=" + isSalary() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
			+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + "]";
}

}
