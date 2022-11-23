package com.tokoonline.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class InternalErrorException extends RuntimeException{
    public InternalErrorException(String message) {
        super(message);
    }
}
