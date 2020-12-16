package com.ecommerce.app.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ecommerce.app.EcommerceApplication;

public class Log {

	private static final Logger log = LoggerFactory.getLogger(EcommerceApplication.class);

	public static void trace(String message) {
		log.trace(message);
	}

	public static void debug(String message) {
		log.debug(message);
	}

	public static void info(String message) {
		log.info(message);
	}

	public static void warn(String message) {
		log.warn(message);
	}

	public static void error(String message) {
		log.error(message);
	}

}
