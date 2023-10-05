package com.brvsk.commons.clients.payment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("payment-service")
public interface PaymentClient {

    @PostMapping(path = "/api/v1/payments/process")
    PaymentResponse processPayment(
            @RequestBody PaymentRequest paymentRequest);
}
