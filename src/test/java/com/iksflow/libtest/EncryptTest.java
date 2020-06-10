package com.iksflow.libtest;

import static org.assertj.core.api.Assertions.assertThat;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.junit.Test;

import com.iksflow.libtest.model.Util;

public class EncryptTest {
	
	@Test
	public void encryptDataTest() {
		Security.addProvider(new BouncyCastleProvider());
		PooledPBEStringEncryptor pbe = new PooledPBEStringEncryptor();
		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		config.setAlgorithm("PBEWITHSHA256AND256BITAES-CBC-BC");
		config.setPoolSize(10);
		config.setPassword("kimchi");
		config.setStringOutputType("hexadecimal");
		pbe.setConfig(config);
		Util util = new Util(pbe, config);
		String plainText = "1234567890123456|0620|678"; 
		String encryptText = util.encrypt(plainText);
		String decryptText = util.decrypt(encryptText);
		System.out.println("평문: " + plainText);
		System.out.println("암호문: " + encryptText);
		System.out.println("복호문: " + decryptText);
		assertThat(plainText).isEqualTo(decryptText);
//		assertThat(encryptText.length()).isEqualTo(64);
	}
	
	@Test
	public void createDtoFromDecryptedDataTest() {
		Security.addProvider(new BouncyCastleProvider());
		PooledPBEStringEncryptor pbe = new PooledPBEStringEncryptor();
		SimpleStringPBEConfig config = new SimpleStringPBEConfig();
		config.setAlgorithm("PBEWITHSHA256AND256BITAES-CBC-BC");
		config.setPoolSize(10);
		config.setPassword("kimchi");
		config.setStringOutputType("hexadecimal");
		pbe.setConfig(config);
		Util util = new Util(pbe, config);
		String plainText = "1234567890123456|0620|678"; 
		String encryptText = util.encrypt(plainText);
		String decryptText = util.decrypt(encryptText);
		String[] cardInfoArray= decryptText.split("\\|");
		PaymentDtoTest dto = new PaymentDtoTest(cardInfoArray[0], cardInfoArray[1], cardInfoArray[2]);
		assertThat("1234567890123456").isEqualTo(dto.getCardNo());
		assertThat("0620").isEqualTo(dto.getExpiryMY());
		assertThat("678").isEqualTo(dto.getCvcNo());
	}
	
	@Test 
	public void createFormattedData() {
		int totalLength = 450;
		int dataSizeLength = 4;
		int dataTypeLength = 10;
		int payNoLength = 20;
		int cardNoLength = 20;
		int istmtMonthLength = 2;
		int expiryMyLength = 4;
		int cvcNoLength = 3;
		int payAmtLength = 10;
		int vatAmtLength = 10;
		int orgnPayNoLength = 20;
		int encPayinfoLength = 300;
		int extraSpaceLength = 47;
		
		
	}
}
