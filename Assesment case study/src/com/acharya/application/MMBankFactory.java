package com.acharya.application;

import com.acharya.framework.Bankfactory;
import com.acharya.framework.CurrentAcc;
import com.acharya.framework.SavingAcc;

public class MMBankFactory extends Bankfactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalary) {
		MMSavingAcc MMSaving = new MMSavingAcc(accNo,accNm,accBal,isSalary);
		return MMSaving;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc MMCurrent = new MMCurrentAcc(accNo,accNm,creditLimit,creditLimit);
		return MMCurrent;
	}

	}


