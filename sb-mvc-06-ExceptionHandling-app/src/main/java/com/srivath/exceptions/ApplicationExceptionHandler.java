package com.srivath.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionHandler {

	private Logger logger = LoggerFactory.getLogger(ApplicationExceptionHandler.class);

	@ExceptionHandler(value = Exception.class)
	public String handleException(Exception ex) {
		logger.error(ex.getMessage());
		//System.out.println(ex.getMessage());
		return "errorPage";
	}
}
