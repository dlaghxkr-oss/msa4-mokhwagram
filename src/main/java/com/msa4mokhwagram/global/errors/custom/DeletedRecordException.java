package com.msa4mokhwagram.global.errors.custom;

public class DeletedRecordException extends RuntimeException{
    public DeletedRecordException(String message) {
        super(message);
    }
}
