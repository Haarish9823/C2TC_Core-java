package com.acharya.application;

import com.acharya.framework.Normalacc;
import com.acharya.framework.Primeacc;
import com.acharya.framework.Shopfactory;


public  class Gsshopfactory extends Shopfactory {

	@Override
	public Primeacc getNewPrimeAccount(int accno, String accNm, float charges, boolean isprime) {
		Gsprimeacc gsprime = new Gsprimeacc(accno,accNm,charges,isprime);
		return gsprime;
	}

	@Override
	public Normalacc getNewNormalAccount(int accno, String accNm, float charges, float deliverycharges) {
		Gsnormalacc gsnormal = new Gsnormalacc(accno, accNm, deliverycharges, deliverycharges );
		return gsnormal;
	}

	
	}
	