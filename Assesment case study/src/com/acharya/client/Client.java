package com.acharya.client;

import com.acharya.application.MMBankFactory;
import com.acharya.application.MMCurrentAcc;
import com.acharya.application.MMSavingAcc;
import com.acharya.framework.Bankfactory;
import com.acharya.framework.CurrentAcc;
import com.acharya.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		Bankfactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(404,"Santhu",350,true);
		CurrentAcc ca = new MMCurrentAcc(406,"Ramesh",420,50000);
        sa.withdraw(sa.getAccBal());
        sa.toString();
        ca.withdraw(ca.getCreditLimit());
        ca.toString();
	}

}
