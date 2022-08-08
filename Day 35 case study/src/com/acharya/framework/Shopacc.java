package com.acharya.framework;

public abstract class Shopacc {
private int accno;
private String accNm;
private float charges;


public Shopacc(int accno, String accNm, float charges) {
	super();
	this.accno = accno;
	this.accNm = accNm;
	this.charges = charges;
}
public void bookproduct(float charges) {
	System.out.println("Product is booked and charges are:"+ charges);
}
public void items(float charges) {
	System.out.println("Items are delivered with charges: "+ charges);
}

public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public String getAccNm() {
	return accNm;
}
public void setAccNm(String accNm) {
	this.accNm = accNm;
}
public float getCharges() {
	return charges;
}
public void setCharges(float charges) {
	this.charges = charges;
}
@Override
public String toString() {
	return "Shopacc [accno=" + accno + ", charges=" + charges + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";
}

}