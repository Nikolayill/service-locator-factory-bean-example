package com.javatechie.slfb.example.service;

public interface PaymentRegistry {
	PaymentService getServiceBean(String serviceName);
}
