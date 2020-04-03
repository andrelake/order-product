package com.andrelake.orderproduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrelake.orderproduct.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
