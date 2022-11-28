package com.wemanage.AuthenticatorService.exception;

public class UserNotFoundException extends Exception {
    public String message;
    public UserNotFoundException(String message){
        super(message);
        this.message = message;
    }

    public UserNotFoundException(){
    }
}
