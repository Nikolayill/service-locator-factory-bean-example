package com.javatechie.slfb.example.service;

import org.springframework.stereotype.Service;

import com.javatechie.slfb.example.dto.PaymentRequest;

@Service(PaymentSystemTypeConst.AMAZONPAY_TYPE)
public class AmazonPay implements PaymentService {

	@Override
	public String pay(PaymentRequest request) {
		return request.getAmount() + " paid successfully using " + request.getPaymentMethod();
	}

}
