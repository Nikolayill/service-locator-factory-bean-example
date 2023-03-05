package com.javatechie.slfb.example.dto;

public interface PaymentSystemTypeConst {
    String AMAZONPAY_TYPE="AmazonPay";
    String PAYTM_TYPE="Paytm";
    String PAYXXX_TYPE="PayXxX";    // This will produce "No bean named 'PayXxX' available" exception
    String PHONEPE_TYPE="PhonePe";
}
