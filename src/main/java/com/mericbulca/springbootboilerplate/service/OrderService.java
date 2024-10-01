package com.mericbulca.springbootboilerplate.service;

import com.mericbulca.springbootboilerplate.domain.Order;

import java.util.UUID;

public interface OrderService {

    Order findOrderById(UUID id);

}
