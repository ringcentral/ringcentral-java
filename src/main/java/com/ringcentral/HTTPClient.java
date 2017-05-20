package com.ringcentral;

import com.alibaba.fastjson.JSON;
import okhttp3.*;

import java.io.IOException;
import java.lang.reflect.Type;

public abstract class HTTPClient {

    private static final MediaType jsonMediaType = MediaType.parse("application/json; charset=utf-8");
    protected String server;

    public abstract ResponseBody request(Request.Builder builder) throws IOException, RestException;

    public ResponseBody get(String endpoint) throws IOException, RestException {
        return request(new Request.Builder().url(server + endpoint));
    }

    public String post(String endpoint, Object object) throws IOException, RestException {
        RequestBody body = RequestBody.create(jsonMediaType, JSON.toJSONString(object));
        return request(new Request.Builder().url(server + endpoint).post(body)).string();
    }

    public String post(String endpoint, FormBody formBody) throws IOException, RestException {
        return request(new Request.Builder().url(server + endpoint).post(formBody)).string();
    }

    public String put(String endpoint, Object object) throws IOException, RestException {
        RequestBody body = RequestBody.create(jsonMediaType, JSON.toJSONString(object));
        return request(new Request.Builder().url(server + endpoint).put(body)).string();
    }

    public void delete(String endpoint) throws IOException, RestException {
        request(new Request.Builder().url(server + endpoint).delete());
    }

    public ResponseBody postBinary(String endpoint, String fileName, String mediaType, byte[] fileContent) throws IOException, RestException {
        RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM)
            .addFormDataPart("image", fileName, RequestBody.create(MediaType.parse(mediaType), fileContent))
            .build();
        return request(new Request.Builder().url(server + endpoint).post(requestBody));
    }

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
