package org.example.PAYMENT;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.logging.SocketHandler;
@Component
@Qualifier
public class CardPayment implements PaymentServices {

    @Override
    public void pay() {
        System.out.println("paying by card");
    }
}
