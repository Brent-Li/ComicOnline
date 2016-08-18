package com.my.comic.exception;

/**
 * Server side exception.
 * Created by Brent on 2016/8/11.
 */
public class ServerException extends Exception {
    private int errorCode;
    private String errorMessage;

    public ServerException() {
        super();
        this.errorCode = 500;
    }

    public ServerException(int errorCode, String errorMessage) {
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
