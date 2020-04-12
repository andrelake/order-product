package com.andrelake.orderproduct.services.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UserInUseException extends ResourceException{

	private static final long serialVersionUID = 1L;

	public UserInUseException(String msg) {
		super(msg);
	}

	public UserInUseException(Long id) {
		super(String.format("Can't delete User with id %d because has being used", id));
	}
}
