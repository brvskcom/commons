package com.brvsk.commons.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PaymentRequest {
    private String cardNumber;
    private int expMonth;
    private int expYear;
    private String cvc;
    private long amount;
    private String currency;

}