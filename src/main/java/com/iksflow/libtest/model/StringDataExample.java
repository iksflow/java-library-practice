package com.iksflow.libtest.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

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
//		System.out.println(Math.(Math.random() * 32));
		System.out.println("고유번호: " + UUID.randomUUID().toString().replace("-", ""));
//		System.out.println("고유번호길이: " + UUID.randomUUID().);
		LocalDateTime now1 = LocalDateTime.now();
		System.out.println(now1.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS")));
		System.out.println(now1.format(DateTimeFormatter.ofPattern("ss")));
		System.out.println(now1.format(DateTimeFormatter.ofPattern("SSS")));
		System.out.println(now1.format(DateTimeFormatter.ofPattern("n")));

		
		System.out.println(Math.ceil(31.171));
		System.out.println(Double.valueOf(Math.floor(31.21)).intValue());
		System.out.println(Math.round(0.5));
		System.out.println("abcdef".substring(3, 6));
		
		
		int random = Double.valueOf(Math.random() * 30).intValue();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		String smallUuid = uuid.substring(random, random + 3);
		String timeId = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
		String uniqueId = timeId + smallUuid;
		System.out.println("고유ID: " + uniqueId);
		System.out.println("고유ID길이: " + uniqueId.length());
		
	}

}
