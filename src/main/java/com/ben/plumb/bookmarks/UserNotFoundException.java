package com.ben.plumb.bookmarks;

import org.h2.api.ErrorCode;

public class UserNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    private final int code;
    private final String userId;

    public UserNotFoundException(int code, String userId) {
	super();
	this.code = code;
	this.userId = userId;
    }

    public UserNotFoundException(String message, Throwable cause, int code, String userId) {
	super(message, cause);
	this.code = code;
	this.userId = userId;
    }

    public UserNotFoundException(String message, int code, String userId) {
	super(message);
	this.code = code;
	this.userId = userId;
    }

    public UserNotFoundException(Throwable cause, int code, String userId) {
	super(cause);
	this.code = code;
	this.userId = userId;
    }

    public int getCode() {
	return this.code;
    }
    
    public String getUserId() {
	return this.userId;
    }

}
