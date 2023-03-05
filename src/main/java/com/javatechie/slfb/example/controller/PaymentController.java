package com.javatechie.slfb.example.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.slfb.example.dto.PaymentRequest;
import com.javatechie.slfb.example.service.PaymentRegistry;

@RestController
@RequestMapping("/payment-service")
@RequiredArgsConstructor
public class PaymentController {
	private final PaymentRegistry registry;

	@PostMapping("/pay")
	public String paymentProcess(@RequestBody PaymentRequest request) {
		String response = "";
		response = registry.getPaymentService(request.getPaymentMethod())
				.pay(request);
		return response;
	}

}
