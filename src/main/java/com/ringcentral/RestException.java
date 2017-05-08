package com.ringcentral;

public class RestException extends Exception {
    private int httpStatusCode;

    RestException(int httpStatusCode, String message) {
        super(message);
        this.httpStatusCode = httpStatusCode;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }
}
