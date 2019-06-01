package com.ringcentral;

import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

import java.io.IOException;
import java.text.MessageFormat;

public class RestException extends Exception {
    public Request request;
    public Response response;

    public RestException(Request request, Response response) throws IOException {
        super(MessageFormat.format("HTTP status code: {0}\n\n{1}\n\nRequest: {2}",
                response.code(),
                response.body().string(),
                requestBodyToString(request.body())
        ));
        this.request = request;
        this.response = response;
    }

    public static String requestBodyToString(RequestBody requestBody) throws IOException {
        Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        return buffer.readUtf8();
    }
}
