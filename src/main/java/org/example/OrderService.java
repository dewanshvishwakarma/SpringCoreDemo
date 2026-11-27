package org.example;

public class OrderService {
    PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }


    public void placed_order(){
        paymentService.pay();
        System.out.println("order was placed");
    }
}
