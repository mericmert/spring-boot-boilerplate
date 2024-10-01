package com.mericbulca.springbootboilerplate.service.impl;

import com.mericbulca.springbootboilerplate.domain.Order;
import com.mericbulca.springbootboilerplate.repository.OrderRepository;
import com.mericbulca.springbootboilerplate.service.OrderService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order findOrderById(UUID id) {
        return orderRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }
}
