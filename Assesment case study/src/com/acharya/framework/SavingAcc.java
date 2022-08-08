package com.acharya.framework;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalary;
	private static final float creditLimit = 0;
	
	
	 public SavingAcc (int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;

}
	 public void withdraw(float accBal) {
		 System.out.println("The charges on account is:" + accBal);
	 } 
	 
	public boolean isSalary() {
		return isSalary;
	}
	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
	public static float getCreditlimit() {
		return creditLimit;
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	 
}