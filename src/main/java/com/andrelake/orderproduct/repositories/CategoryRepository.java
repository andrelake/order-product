package com.andrelake.orderproduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrelake.orderproduct.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
