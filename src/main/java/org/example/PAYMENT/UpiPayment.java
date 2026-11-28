package org.example.PAYMENT;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("up")
public class UpiPayment implements PaymentServices{
    @Override
    public void pay() {
        System.out.println("paying by upi");
    }
}
