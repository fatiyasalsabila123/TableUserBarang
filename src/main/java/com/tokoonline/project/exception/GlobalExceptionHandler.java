package com.tokoonline.project.exception;


import com.tokoonline.project.response.ResponseHelper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<?> notFound(NotFoundException notFoundException) {
        return ResponseHelper.error(notFoundException.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(InternalErrorException.class)
    public ResponseEntity<?> internalEeror(InternalErrorException InternalErrorException) {
        return ResponseHelper.error(InternalErrorException.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @ExceptionHandler(EmailException.class)
    public ResponseEntity<?> emailEeror(EmailException EmailException) {
        return ResponseHelper.error(EmailException.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

