package com.github.minthic.boredapp.controller.validation;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;

@ControllerAdvice
public class ValidationExceptionHandler extends ResponseEntityExceptionHandler
{
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request)
    {
        List<String> violations = ex.getBindingResult().getAllErrors()
                .stream()
                .map(this::buildViolation)
                .toList();

        InvalidRequestErrorMessage errorMessage = new InvalidRequestErrorMessage(violations);

        return new ResponseEntity<>(errorMessage, HttpStatus.BAD_REQUEST);
    }

    private String buildViolation(ObjectError error)
    {
        return "'" + ((FieldError) error).getField() + "' " + error.getDefaultMessage();
    }
}
