package com.ringcentral;

import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

import java.io.IOException;
import java.text.MessageFormat;

public class Utils {
    public static String formatHttpMessage(Response response, Request request) {
        String responseBodyString = "";
        try {
            responseBodyString = response.peekBody(Long.MAX_VALUE).string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return MessageFormat.format("HTTP Response\n=============\nstatus code: {0}\n\n{1}\n{2}\n\nHTTP Request\n============\nHTTP {3} {4}\n\n{5}\n{6}",
            response.code(),
            response.headers().toString(),
            responseBodyString,
            request.method(),
            request.url().toString(),
            request.headers().toString(),
            requestBodyToString(request.body())
        );
    }

    private static String requestBodyToString(RequestBody requestBody) {
        if (requestBody == null) {
            return "";
        }
        Buffer buffer = new Buffer();
        try {
            requestBody.writeTo(buffer);
        } catch (IOException e) {
            return "";
        }
        return buffer.readUtf8();
    }
}
