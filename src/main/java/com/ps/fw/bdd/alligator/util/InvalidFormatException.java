package com.ps.fw.bdd.alligator.util;

public class InvalidFormatException extends Exception{
    public InvalidFormatException(String message) {
        super(message);
    }

    public InvalidFormatException(String message, Exception e) {
        super(message,e);
    }
}
