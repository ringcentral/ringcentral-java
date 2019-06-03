package com.ringcentral;

import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.Buffer;

import java.io.IOException;
import java.text.MessageFormat;

public class Utils {
    public static String formatHttpMessage(Response response, Request request) throws IOException {
        return MessageFormat.format("HTTP status code: {0}\n\n{1}\n\nRequest: {2}\n\nBody:{3}",
            response.code(),
            response.body().string(),
            request.url().toString(),
            requestBodyToString(request.body())
        );
    }

    public static String requestBodyToString(RequestBody requestBody) throws IOException {
        if (requestBody == null) {
            return "";
        }
        Buffer buffer = new Buffer();
        requestBody.writeTo(buffer);
        return buffer.readUtf8();
    }
}
