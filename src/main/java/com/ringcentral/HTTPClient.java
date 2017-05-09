package com.ringcentral;

import com.alibaba.fastjson.JSON;
import okhttp3.FormBody;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.lang.reflect.Type;

public abstract class HTTPClient {

    public abstract ResponseBody get(String endpoint) throws IOException, RestException;

    public abstract String post(String endpoint, FormBody formBody) throws IOException, RestException;

    public abstract String post(String endpoint, Object object) throws IOException, RestException;

    public abstract String put(String endpoint, Object object) throws IOException, RestException;

    public <T> T get(String endpoint, Type type) throws IOException, RestException {
        return JSON.parseObject(get(endpoint).string(), type);
    }

    public <T> T post(String endpoint, FormBody formBody, Type type) throws IOException, RestException {
        String jsonString = post(endpoint, formBody);
        return JSON.parseObject(jsonString, type);
    }

    public <T> T post(String endpoint, Object object, Type type) throws IOException, RestException {
        String jsonString = post(endpoint, object);
        return JSON.parseObject(jsonString, type);
    }

    public <T> T put(String endpoint, Object object, Type type) throws IOException, RestException {
        String jsonString = put(endpoint, object);
        return JSON.parseObject(jsonString, type);
    }
}
