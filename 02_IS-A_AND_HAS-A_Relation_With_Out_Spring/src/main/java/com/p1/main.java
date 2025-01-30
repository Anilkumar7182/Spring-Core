package com.p1;

import com.p1.entity.Restorant;
import com.p1.payment.CreditCard;

public class main {
	public static void main(String[] args) {
		
		Restorant restorant = new Restorant(new CreditCard());
		
		restorant.Bill();
	}
}
