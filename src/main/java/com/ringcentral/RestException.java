package com.ringcentral;

import java.text.MessageFormat;

public class RestException extends Exception {
    private int httpStatusCode;

    RestException(int httpStatusCode, String message) {
        super(MessageFormat.format("HTTP status code: {0}\n\n{1}", httpStatusCode, message));
        this.httpStatusCode = httpStatusCode;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }
}
