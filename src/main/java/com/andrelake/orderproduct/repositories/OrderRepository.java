package com.andrelake.orderproduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrelake.orderproduct.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
