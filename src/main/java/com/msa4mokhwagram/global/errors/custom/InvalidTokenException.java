package com.msa4mokhwagram.global.errors.custom;

public class InvalidTokenException extends RuntimeException{
    public InvalidTokenException(String message) {
        super(message);
    }
}
