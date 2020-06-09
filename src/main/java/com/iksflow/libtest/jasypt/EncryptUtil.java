package com.iksflow.libtest.jasypt;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;

public class EncryptUtil {
	
	private static EncryptUtil util = new EncryptUtil();
	private static PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
	private static SimpleStringPBEConfig config = new SimpleStringPBEConfig();
	private EncryptUtil() {	};
	public static EncryptUtil getInstance() {
		initConfig(config);
		setConfigEncryptor(encryptor);
		return util;
	}
	private static void initConfig(SimpleStringPBEConfig config) {
		Security.addProvider(new BouncyCastleProvider());
		config.setAlgorithm("PBEWITHSHA256AND256BITAES-CBC-BC");
		config.setPoolSize(10);
		config.setPassword("kimchi");
		config.setStringOutputType("hexadecimal");	
	}
	
	private static void setConfigEncryptor(PooledPBEStringEncryptor encryptor) {
		encryptor.setConfig(config);
	}
	public static PooledPBEStringEncryptor getEncryptor() {
		return encryptor;
	}
	public static SimpleStringPBEConfig getConfig() {
		return config;
	}
}
