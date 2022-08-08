package com.acharya.framework;

public abstract class Primeacc extends Shopacc {
	

	private boolean isprime;
	private static final float deliverycharges=0;
	
	
	 public Primeacc(int accno, String accNm, float charges, boolean isprime) {
		super(accno, accNm, charges);
		this.isprime = isprime;
	}
	public void bookproduct(float charges) {
	System.out.println("The charges of the product is :" + charges);
	}
	
	
	
	public boolean isIsprime() {
		return isprime;
	}
	public void setIsprime(boolean isprime) {
		this.isprime = isprime;
	}
	public static float getDeliverycharges() {
		return deliverycharges;
	}
	@Override
	public String toString() {
		return "Primeacc [isprime=" + isprime + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	}
	
