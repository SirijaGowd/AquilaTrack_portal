package com.Aquiltrack.qa.Exception;

@SuppressWarnings("serial")
public class InvalidExcelFilePath extends FrameworkException {

	public InvalidExcelFilePath(String message) {
		super(message);
		
	}
	
	public InvalidExcelFilePath(String message,Throwable cause) {
		super(message,cause);
		
	}

}
