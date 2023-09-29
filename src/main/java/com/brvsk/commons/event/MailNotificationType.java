package com.brvsk.commons.event;

public enum MailNotificationType {
    ORDER_PLACED("Order Placed"),
    ORDER_PAID("Order Paid"),
    ORDER_SHIPPED("Order Shipped"),
    ORDER_RECEIVED("Order Received");

    private final String mailTitle;

    MailNotificationType(String mailTitle) {
        this.mailTitle = mailTitle;
    }

    public String getMailTitle() {
        return mailTitle;
    }
}
