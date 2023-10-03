package com.brvsk.commons.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class OrderSMSMessage {
    private String phoneNumber;
    private String orderTrackingNumber;
    private String orderSmsTypeString;

}
