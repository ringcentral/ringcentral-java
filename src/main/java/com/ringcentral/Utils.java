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
            responseBodyString = response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return MessageFormat.format("HTTP status code: {0}\n\n{1}\n\n{2}\n\nRequest: {3}\n\n{4}\n\nBody:{5}",
            response.code(),
            response.headers().toString(),
            responseBodyString,
            request.url().toString(),
            request.headers().toString(),
            requestBodyToString(request.body())
        );
    }

    public static String requestBodyToString(RequestBody requestBody) {
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
