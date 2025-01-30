package com.p1.payment;

public class Online implements Payment {

	@Override
	public int mode() {
		System.out.println("payment Online succefull");
		return 1;
	}

}
