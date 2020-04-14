package com.iksflow.libtest.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RootLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
		Logger simpleLogger = LogManager.getRootLogger();
		Logger childLogger = LogManager.getLogger();
		logger.error(LogManager.ROOT_LOGGER_NAME);
		simpleLogger.error("Hi");
		childLogger.error("Hi");
	}

}
