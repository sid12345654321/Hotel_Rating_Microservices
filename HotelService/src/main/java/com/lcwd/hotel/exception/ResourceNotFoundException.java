package com.lcwd.hotel.exception;

import org.aspectj.bridge.Message;


public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String mes) {
        super(mes);
    }

    public ResourceNotFoundException(){
        super();
    }
}
