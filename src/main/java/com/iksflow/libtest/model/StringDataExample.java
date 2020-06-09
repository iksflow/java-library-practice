package com.iksflow.libtest.model;

public class StringDataExample {

	public static void main(String[] args) {
		String tabString = "_";
		String digit = "4";
		String format = "%" + tabString + digit + "s"; 
		System.out.println(format);
		
		System.out.println(String.format("%10s", "efghij"));
		System.out.println(String.format("%-10s", "abcd"));
		
		PaymentDto dto = new PaymentDto(PaymentType.PAYMENT, "1", "1234567890123456", "0520", "999");
		System.out.println("strData: " + dto.stringData());
	}

}
