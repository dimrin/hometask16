package com.company.dymrin16;

public class FileMaxSiseReachedException extends Exception{
    private final String exception;

    public FileMaxSiseReachedException(String exception) {
        this.exception = exception;
    }

    @Override
    public String toString() {
        return exception;
    }
}
