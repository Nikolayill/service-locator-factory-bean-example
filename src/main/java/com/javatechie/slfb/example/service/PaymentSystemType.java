package com.javatechie.slfb.example.service;

import static com.javatechie.slfb.example.service.PaymentSystemTypeConst.*;

public enum PaymentSystemType {
    AMAZONPAY(AMAZONPAY_TYPE),
    PAYTM(PAYTM_TYPE),
    PAYXXX(PAYXXX_TYPE),
    PHONEPE(PHONEPE_TYPE);

    private final String typeName;

    PaymentSystemType(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return this.typeName;
    }
}
