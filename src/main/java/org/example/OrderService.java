package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
    @Autowired
    PaymentService paymentService;

// this is constructor dependency injection
//    @Autowired
//    public OrderService(PaymentService paymentService){
//        this.paymentService=paymentService;
//    }


// using setter method
//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placed_order(){
        paymentService.pay();
        System.out.println("order was placed");
    }
}
