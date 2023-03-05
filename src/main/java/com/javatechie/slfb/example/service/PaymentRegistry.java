package com.javatechie.slfb.example.service;

import com.javatechie.slfb.example.dto.PaymentSystemType;

public interface PaymentRegistry {
	PaymentService getPaymentService(PaymentSystemType serviceName);
}
