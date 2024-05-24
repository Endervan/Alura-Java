package com.enderximenes.workshopmongo.service;

public class ObjectNotFoundException extends RuntimeException {
    private static final long seriaversionlUID = 1L;


    public ObjectNotFoundException(String msg) {
        super(msg);
    }
}
