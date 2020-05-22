package org.shilpa.java.exception;

/**
 * @author Shilpa
 * @implNote Custom exeption class for handling exception scenarios
 * **/
public class ApplicationException extends Exception {

	private String errorCode;
    private String errorMessage;
	
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
    
    
}
