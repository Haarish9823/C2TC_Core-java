package com.acharya.client;

import com.acharya.application.Gsnormalacc;
import com.acharya.application.Gsprimeacc;
import com.acharya.application.Gsshopfactory;
import com.acharya.framework.Normalacc;
import com.acharya.framework.Primeacc;
import com.acharya.framework.Shopfactory;

public class Client {

	public static void main(String[] args) {
		Shopfactory sf = new Gsshopfactory();
		
		Primeacc pa = new Gsprimeacc(101,"haarish", 5000 ,true);
		Normalacc na = new Gsnormalacc(102,"Raghu",5000,100);
		pa.bookproduct(pa.getCharges());
		pa.toString();
		na.bookproduct(na.getDeliverycharges());
		na.toString();
		
		
		

	}

}
