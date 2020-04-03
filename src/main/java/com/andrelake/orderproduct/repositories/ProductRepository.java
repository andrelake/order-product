package com.andrelake.orderproduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrelake.orderproduct.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
