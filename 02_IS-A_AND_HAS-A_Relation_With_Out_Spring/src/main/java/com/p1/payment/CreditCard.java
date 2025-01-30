package com.p1.payment;

public class CreditCard implements Payment {

	@Override
	public int mode() {
		System.out.println("Payment Debit succefull");
		return 1;
	}

}
