package com.ben.plumb.bookmarks;

import org.h2.api.ErrorCode;

public class BookmarkNotFoundException extends Exception {

    private static final long serialVersionUID = 1L;

    private final int code;
    private final Long bookmarkId;

    public BookmarkNotFoundException(int code, Long bookmarkId) {

	super();
	this.code = code;
	this.bookmarkId = bookmarkId;
    }

    public BookmarkNotFoundException(String message, Throwable cause, int code, Long bookmarkId) {

	super(message, cause);
	this.code = code;
	this.bookmarkId = bookmarkId;
    }

    public BookmarkNotFoundException(String message, int code, Long bookmarkId) {

	super(message);
	this.code = code;
	this.bookmarkId = bookmarkId;
    }

    public BookmarkNotFoundException(Throwable cause, int code, Long bookmarkId) {

	super(cause);
	this.code = code;
	this.bookmarkId = bookmarkId;
    }

    public int getCode() {

	return this.code;
    }

    public Long getUserId() {

	return this.bookmarkId;
    }

}
