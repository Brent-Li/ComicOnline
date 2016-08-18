package com.my.comic.exception;

/**
 * Client side exception.
 * Created by Brent on 2016/8/11.
 */
public class ClientException extends Exception {
    private int errorCode;
    private String errorMessage;

    public ClientException() {
        super();
        this.errorCode = 400;
    }

    public ClientException(int errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
