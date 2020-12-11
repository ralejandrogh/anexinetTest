package com.anexinet.test.second.exceptions;

public class StringRepeatedException extends Exception {

    private static final long serialVersionUID = 1L;

    public StringRepeatedException(String error, Throwable e) {
        super(error, e);
    }

    public StringRepeatedException(String error) {
        super(error);
    }
}
