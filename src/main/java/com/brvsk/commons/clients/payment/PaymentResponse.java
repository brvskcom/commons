package com.brvsk.commons.clients.payment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentResponse {
    private String paymentNumber;

    public PaymentResponse(String paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public PaymentResponse() {
    }
}
