package com.brvsk.commons.event;

import lombok.*;

@Getter
@Setter
public class OrderEvent {
    private String email;
    private String orderTrackingNumber;
    private String mailNotificationType;

    public OrderEvent(String email, String orderTrackingNumber, String mailNotificationType) {
        this.email = email;
        this.orderTrackingNumber = orderTrackingNumber;
        this.mailNotificationType = mailNotificationType;
    }
}
