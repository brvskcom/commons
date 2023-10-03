package com.brvsk.commons.event;

import lombok.Getter;

@Getter
public class OrderMailMessage {
    private String userEmail;
    private String orderTrackingNumber;
    private String orderMailTypeString;

    public OrderMailMessage(String userEmail, String orderTrackingNumber, String orderMailTypeString) {
        this.userEmail = userEmail;
        this.orderTrackingNumber = orderTrackingNumber;
        this.orderMailTypeString = orderMailTypeString;
    }
}

