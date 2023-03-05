package com.javatechie.slfb.example.service;

public interface PaymentRegistry {
	PaymentService getPaymentService(PaymentSystemType serviceName);
}
