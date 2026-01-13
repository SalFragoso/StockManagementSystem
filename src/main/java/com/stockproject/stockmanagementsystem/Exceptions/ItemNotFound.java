package com.stockproject.stockmanagementsystem.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)  // Returns a 404 when Exception is used
public class ItemNotFound extends RuntimeException{

    public ItemNotFound(Long id) {

        super("Item not found " + id);
    }
}
