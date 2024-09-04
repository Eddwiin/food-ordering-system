package com.food.ordering.system.service.application.rest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(value = "/orders", produces = "application/vnd.api.v1+json")
public class OrderController {

    private final OrderApplicationService orderApplicationService;

    public OrderController(OrderApplicationService orderApplicationService) {
        this.orderApplicationService = orderApplicationService;
    }

    public ResponseEntity<CreateOrderResponse> createOrder(@RequestBody CreateOrderResponse createOrderResponse) {

    }
}


