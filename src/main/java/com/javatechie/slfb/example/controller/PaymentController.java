package com.javatechie.slfb.example.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.slfb.example.dto.PaymentRequest;
import com.javatechie.slfb.example.service.AmazonPay;
import com.javatechie.slfb.example.service.PaymentRegistry;
import com.javatechie.slfb.example.service.Paytm;
import com.javatechie.slfb.example.service.PhonePe;

@RestController
@RequestMapping("/payment-service")
@RequiredArgsConstructor
public class PaymentController {
	private final PaymentRegistry registry;

	@PostMapping("/pay")
	public String paymentProcess(@RequestBody PaymentRequest request) {
		String response = "";
		response = registry.getServiceBean(request.getPaymentMethod()).pay(request);
		return response;
	}

}
