package com.p1.entity;

import com.p1.payment.Payment;

public class Restorant {
	
	private Payment payment;
	
	
	
	public Restorant() {
		super();
	}



	public Restorant(Payment payment) {
		super();
		this.payment = payment;
	}


	

	public Payment getPayment() {
		return payment;
	}



	public void setPayment(Payment payment) {
		this.payment = payment;
	}



	public void Bill() {
		int status = payment.mode();
		
		if(status <=1) {
			System.out.println("Bill gerreted succfull");
		}else {
			System.out.println("Sorry payment is not resave bill not gernate");
		}
	}

}
