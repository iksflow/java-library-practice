package com.iksflow.libtest.model;

public class PaymentDto {
	private int dataLen = 4;
	private int maxLen = 450;
	private PaymentType paymentType;
	private String tabChar = "_";
	private String payNo;
	private String cardNo;
	private String expiryMMYY;
	private String cvcNo;
	public PaymentDto(PaymentType paymentType, String payNo, String cardNo, String expiryMMYY, String cvcNo) {
		this.paymentType = paymentType;
		this.payNo = payNo;
		this.cardNo = cardNo;
		this.expiryMMYY = expiryMMYY;
		this.cvcNo = cvcNo;
	}
	
	public String stringData() {
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("%4s", maxLen-dataLen))
		.append(String.format("%-10s", paymentType))
		.append(String.format("%-20s", payNo));
		return sb.toString().replace(" ", tabChar);
	}
}
