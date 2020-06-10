package com.iksflow.libtest;

public class PaymentDtoTest {
	private String cardNo;
	private String expiryMY;
	private String cvcNo;

	public PaymentDtoTest(String cardNo, String expiryMY, String cvcNo) {
		this.cardNo = cardNo;
		this.expiryMY = expiryMY;
		this.cvcNo = cvcNo;
	}

	public String getCardNo() {
		return cardNo;
	}

	public String getExpiryMY() {
		return expiryMY;
	}

	public String getCvcNo() {
		return cvcNo;
	}
	
}
