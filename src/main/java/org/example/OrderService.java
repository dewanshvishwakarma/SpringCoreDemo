package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    PaymentService paymentService;

// this is constructor dependency injection
//    @Autowired
//    public OrderService(PaymentService paymentService){
//        this.paymentService=paymentService;
//    }



    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placed_order(){
        paymentService.pay();
        System.out.println("order was placed");
    }
}
