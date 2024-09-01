package com.food.ordering.system;

import com.food.ordering.system.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.order.service.domain.ports.output.message.publisher.payment.OrderCreatedPaymentRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Component
public class OrderCreatedEventApplicationListener {
    private final OrderCreatedPaymentRequest orderCreatedPaymentRequest;

    public OrderCreatedEventApplicationListener(OrderCreatedPaymentRequest orderCreatedPaymentRequest) {
        this.orderCreatedPaymentRequest = orderCreatedPaymentRequest;
    }

    @TransactionalEventListener
    void process(OrderCreatedEvent orderCreatedEvent) {

    }
}
