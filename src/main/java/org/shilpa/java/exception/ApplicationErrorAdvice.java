package org.shilpa.java.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author shilpa
 * @implNote ExceptionHandler to handle Custom Exceptions 
 * **/
@ControllerAdvice
public class ApplicationErrorAdvice {
	
    @ExceptionHandler({ApplicationException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> displayApplicationError(ApplicationException e) {
        return new ResponseEntity<>("Error finding the shipping line details",HttpStatus.NOT_FOUND);
    }
}
  