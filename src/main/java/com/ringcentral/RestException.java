package com.ringcentral;

import java.io.IOException;
import okhttp3.Request;
import okhttp3.Response;

public class RestException extends Exception {
    public Request request;
    public Response response;

    public RestException(Response response, Request request) throws IOException {
        super(Utils.formatHttpMessage(response, request));
        this.request = request;
        this.response = response;
    }
}
