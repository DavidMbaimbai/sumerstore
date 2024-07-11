package com.sumer.exception;

public class OperationNotPermittedException extends RuntimeException{
    public OperationNotPermittedException(String msg){
        super(msg);
    }
}
