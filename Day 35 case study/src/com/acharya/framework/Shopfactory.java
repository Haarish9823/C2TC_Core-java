package com.acharya.framework;

public abstract class Shopfactory {
	
    public abstract Primeacc getNewPrimeAccount(int accno,String accNm,float charges,boolean isprime);
	public abstract Normalacc getNewNormalAccount(int accno,String accNm,float charges,float deliverycharges);
}
