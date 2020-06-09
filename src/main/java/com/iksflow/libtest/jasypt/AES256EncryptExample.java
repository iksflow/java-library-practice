package com.iksflow.libtest.jasypt;

public class AES256EncryptExample {
	public static void main(String[] args) {
		EncryptUtil eu = EncryptUtil.getInstance();
		String encryptText = EncryptUtil.getEncryptor().encrypt("ABC");
		System.out.println(encryptText);
	}
}
