package com.iksflow.libtest.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerBuilder {
	private static final Logger logger = LogManager.getLogger();
	public static void main(String[] args) {
		logger.trace("Hi, It's trace log.");
		logger.debug("Hi, It's debug log.");
		logger.info("Hi, It's info log.");
		logger.warn("Hi, It's warn log.");
		logger.error("Hi, It's error log.");
		logger.fatal("Hi, It's fatal log.");
	}

}
