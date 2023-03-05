package com.javatechie.slfb.example.service;

public interface PaymentSystemTypeConst {
    String AMAZONPAY_TYPE="AmazonPay";
    String PAYTM_TYPE="Paytm";
    String PAYXXX_TYPE="PayXxX";    // This will produce "No bean named 'PayXxX' available" exception
    String PHONEPE_TYPE="PhonePe";
}
