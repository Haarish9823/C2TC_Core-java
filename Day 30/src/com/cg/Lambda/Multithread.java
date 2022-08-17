package com.cg.Lambda;
class Eclipse implements Runnable{
	public void run() {
		System.out.println("I am run method");
	}
}
public class Multithread {

	public static void main(String[] args) {
		Eclipse obj = new Eclipse();
		Thread t = new Thread(obj);
		t.start();

	}

}
// I am run method