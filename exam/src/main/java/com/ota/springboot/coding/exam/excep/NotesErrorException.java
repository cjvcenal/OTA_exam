package com.ota.springboot.coding.exam.excep;

public class NotesErrorException extends RuntimeException {
	public NotesErrorException(String message) {
		super(message);
	}

	public NotesErrorException(String message, Throwable cause) {
		super(message, cause);
	}

	public NotesErrorException(Throwable cause) {
		super(cause);
	}
}
