package com.andrelake.orderproduct.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrelake.orderproduct.entities.User;
import com.andrelake.orderproduct.repositories.UserRepository;
import com.andrelake.orderproduct.services.exceptions.UserNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
//		User user = findOrFail(id);
//		return user;
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User user) {
		User oldUser = repository.getOne(id);
		updateDate(oldUser, user);
		return repository.save(oldUser);
	}

	private void updateDate(User oldUser, User user) {
		BeanUtils.copyProperties(user, oldUser, "id", "password");
		
	}
	
	public User findOrFail(Long id) {
		
		User user = repository.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));
		
		return user;
	}
}
