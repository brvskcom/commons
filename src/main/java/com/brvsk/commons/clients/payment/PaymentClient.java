package com.brvsk.commons.clients.payment;

import com.brvsk.commons.payment.PaymentRequest;
import com.brvsk.commons.payment.PaymentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("payment")
public interface PaymentClient {

    @PostMapping(path = "api/v1/payments/process")
    PaymentResponse processPayment(
            @RequestBody PaymentRequest paymentRequest);
}
