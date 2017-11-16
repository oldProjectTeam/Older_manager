package com.older.manager.exception;

/**
 * 系统自定义的异常类型，实际开发中可能要定义多种异常类型
 */
public class ShopException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 异常信息
	private String message;

	public ShopException(String message) {
		super(message);
		this.message = message;

	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
