package com.andrelake.orderproduct.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrelake.orderproduct.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	//endpoint para acessar os usuários
	@GetMapping
	public ResponseEntity<User> findAll() {
		
		User user = new User(3L, "Maria", "maria@gmail.com", "14999999999", "1234");
		
		return ResponseEntity.ok().body(user);
	}
}
