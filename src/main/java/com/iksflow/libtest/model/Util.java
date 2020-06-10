package com.iksflow.libtest.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;

public class Util {
	private PooledPBEStringEncryptor encryptor;
	private SimpleStringPBEConfig config;
	
//	private static void initConfig(SimpleStringPBEConfig config) {
//		Security.addProvider(new BouncyCastleProvider());
//		config.setAlgorithm("PBEWITHSHA256AND256BITAES-CBC-BC");
//		config.setPoolSize(10);
//		config.setPassword("kimchi");
//		config.setStringOutputType("hexadecimal");	
//		encryptor.setConfig(config);
//	}
	public Util(PooledPBEStringEncryptor pbe, SimpleStringPBEConfig config) {
		this.encryptor = pbe;
		this.config = config;
	}
	public String encrypt(String plainText) {
		return encryptor.encrypt(plainText);
	}
	
	public String decrypt(String encryptText) {
		return encryptor.decrypt(encryptText);
	}
	
	public String createPaymentId() {

		int random = Double.valueOf(Math.random() * 30).intValue();
		String uuid = UUID.randomUUID().toString().replace("-", "");
		String smallUuid = uuid.substring(random, random + 3);
		String timeId = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
		String uniqueId = timeId + smallUuid;
		System.out.println("고유ID: " + uniqueId);
		System.out.println("고유ID길이: " + uniqueId.length());
		
		return uniqueId;
	}
}
