package com.acharya.framework;

public abstract class Normalacc extends Shopacc {
	
	private final float deliverycharges;
	
	 public Normalacc(int accno, String accNm, float charges, float deliverycharges) {
		super(accno, accNm, charges);
		this.deliverycharges = deliverycharges;
	}
	public void bookproduct(float deliverycharges) {
System.out.println("The charges of the product is:"+ deliverycharges);
}
	
	public float getDeliverycharges() {
		return deliverycharges;
	}
	@Override
	public String toString() {
		return "Normalacc [deliverycharges=" + deliverycharges + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	}
	
