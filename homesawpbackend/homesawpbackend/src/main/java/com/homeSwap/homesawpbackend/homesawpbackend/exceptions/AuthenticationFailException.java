package com.homeSwap.homesawpbackend.homesawpbackend.exception;

public class AuthenticationFailException extends IllegalArgumentException {
    public AuthenticationFailException(String msg){
        super(msg);
    }
}
