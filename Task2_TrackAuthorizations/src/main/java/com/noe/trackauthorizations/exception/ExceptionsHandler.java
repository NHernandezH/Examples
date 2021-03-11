/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noe.trackauthorizations.exception;

import com.noe.trackauthorizations.dto.ErrorDTO;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * @author noe_5
 */
@ControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler {

   
    @ExceptionHandler(value = AuthorizationNotFoundException.class)
    public ResponseEntity<ErrorDTO> rechazoContracargoExcepcionHandler(AuthorizationNotFoundException exception) {
        ErrorDTO error = new ErrorDTO("Authorization not found", "422");
        return new ResponseEntity<>(error, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        
        String messages = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .map(FieldError::getDefaultMessage)
                .collect(Collectors.joining(","));
        ErrorDTO error = new ErrorDTO(messages, "400");
        
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}