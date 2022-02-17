package com.dev.course_spring.exception;

public class DomainNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DomainNotFoundException(String message) {
		super(message);
	}

	public DomainNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
