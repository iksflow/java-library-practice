package com.iksflow.libtest.model;

public enum PaymentType {
	PAYMENT(1), 
	CANCEL(2);
	
	private PaymentType(int code) {
		this.code = code;
	}
	
	private int code;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
