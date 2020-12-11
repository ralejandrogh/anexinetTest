package com.anexinet.test.sixth.exception;

public class StringLenghtException extends Exception{

    private static final long serialVersionUID = 1L;

    public StringLenghtException(String error, Throwable e) {
        super(error, e);
    }

    public StringLenghtException(String error) {
        super(error);
    }
}
