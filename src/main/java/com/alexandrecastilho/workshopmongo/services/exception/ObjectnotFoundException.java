package com.alexandrecastilho.workshopmongo.services.exception;

public class ObjectnotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ObjectnotFoundException(String msg) {
		super(msg);
	}
}
