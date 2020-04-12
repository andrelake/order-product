package com.andrelake.orderproduct.services.exceptions;

public class ResourceException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ResourceException(String msg) {
		super(msg);
	}
}
