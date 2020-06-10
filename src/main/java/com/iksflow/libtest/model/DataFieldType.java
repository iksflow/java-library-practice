package com.iksflow.libtest.model;

public enum DataFieldType {
	NUMBER(1, "1"),
	NUMBER_0(2, "1"),
	NUMBER_L(3, "1"),
	CHAR(4, "1");
	
	private int code;
	private String format;
	
	
	private DataFieldType(int code, String format) {
		this.code = code;
		this.format = format;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
}
