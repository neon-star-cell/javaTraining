package com.ibm.spring.services;

import org.springframework.stereotype.Component;

@Component("CreditCardService")
public class CreditCardService implements PaymentService {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " paid using credit card");
	}
}
