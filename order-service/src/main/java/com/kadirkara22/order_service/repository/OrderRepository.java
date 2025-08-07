package com.kadirkara22.order_service.repository;

import com.kadirkara22.order_service.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
