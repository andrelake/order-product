package com.andrelake.orderproduct.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrelake.orderproduct.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
