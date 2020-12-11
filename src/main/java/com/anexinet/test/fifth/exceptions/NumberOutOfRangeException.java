package com.anexinet.test.fifth.exceptions;

public class NumberOutOfRangeException extends Exception {

    private static final long serialVersionUID = 1L;

    public NumberOutOfRangeException(String error, Throwable e) {
        super(error, e);
    }

    public NumberOutOfRangeException(String error) {
        super(error);
    }
}
