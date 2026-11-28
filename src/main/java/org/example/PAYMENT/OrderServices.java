package org.example.PAYMENT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderServices {
   private PaymentServices paymentServices;
    @Autowired
    public OrderServices(@Qualifier("up") PaymentServices paymentServices) {
        this.paymentServices = paymentServices;
    }

   public void order(){
        paymentServices.pay();
        System.out.println("order placed");
    }
}
