package com.ringcentral;

import okhttp3.Request;
import okhttp3.Response;

public interface HttpEventListener {
    void afterHttpCall(Response response, Request request);
}
