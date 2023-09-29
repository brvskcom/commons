package com.brvsk.commons.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    private String email;
    private String orderTrackingNumber;
    private MailNotificationType mailNotificationType;
}
