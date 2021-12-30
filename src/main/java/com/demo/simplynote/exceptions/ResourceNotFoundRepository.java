package com.demo.simplynote.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundRepository extends RuntimeException {

    public ResourceNotFoundRepository(String message) {
        super(message);
    }
}
