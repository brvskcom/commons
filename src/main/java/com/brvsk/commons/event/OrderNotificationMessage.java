package com.brvsk.commons.event;

import lombok.Getter;

@Getter
public class OrderNotificationMessage {
    private String userEmail;
    private String orderTrackingNumber;
    private String mailNotificationTypeString;

    public OrderNotificationMessage(String userEmail, String orderTrackingNumber, String mailNotificationTypeString) {
        this.userEmail = userEmail;
        this.orderTrackingNumber = orderTrackingNumber;
        this.mailNotificationTypeString = mailNotificationTypeString;
    }
}

