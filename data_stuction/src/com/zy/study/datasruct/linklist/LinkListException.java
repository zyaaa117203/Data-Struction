package com.zy.study.datasruct.linklist;

public class LinkListException extends Exception {

	private static final long serialVersionUID = 1L;

	private String errorCode;

	private boolean isValid = true;

	public LinkListException(String message) {
		super(message);
	}

	public LinkListException(String message, Throwable cause) {
		super(message, cause);
	}

	public LinkListException(String message, String errorCode) {
		this(message, errorCode, true);
	}

	public LinkListException(String message, String errorCode, boolean isValid) {
		super(message);
		this.setErrorCode(errorCode);
		this.setValid(isValid);
	}

	public LinkListException(String message, String errorCode, Throwable cause, boolean isValid) {
		super(message, cause);
		this.setErrorCode(errorCode);
		this.setValid(isValid);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

}
