package com.mericbulca.springbootboilerplate.repository;

import com.mericbulca.springbootboilerplate.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<Order, UUID> {
}
