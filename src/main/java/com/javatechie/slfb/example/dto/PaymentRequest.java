package com.javatechie.slfb.example.dto;

import com.javatechie.slfb.example.service.PaymentSystemType;
import lombok.Data;

@Data
public class PaymentRequest {
	private long amount;
	private PaymentSystemType paymentMethod;
}
