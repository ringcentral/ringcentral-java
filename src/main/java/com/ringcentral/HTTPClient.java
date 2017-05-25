package com.ringcentral;

import com.alibaba.fastjson.JSON;
import okhttp3.*;

import java.io.IOException;
import java.lang.reflect.Type;

public abstract class HTTPClient {

    private static final MediaType jsonMediaType = MediaType.parse("application/json; charset=utf-8");
    protected String server;

    public abstract ResponseBody request(Request.Builder builder) throws IOException, RestException;

    public ResponseBody get(String endpoint, QueryParameter... queryParameters) throws IOException, RestException {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(server + endpoint).newBuilder();
        for (QueryParameter queryParameter : queryParameters) {
            urlBuilder = urlBuilder.addQueryParameter(queryParameter.key, queryParameter.value);
        }
        return request(new Request.Builder().url(urlBuilder.build()));
    }

    public ResponseBody post(String endpoint, Object object) throws IOException, RestException {
        RequestBody body = RequestBody.create(jsonMediaType, JSON.toJSONString(object));
        return request(new Request.Builder().url(server + endpoint).post(body));
    }

    public ResponseBody post(String endpoint, RequestBody RequestBody) throws IOException, RestException {
        return request(new Request.Builder().url(server + endpoint).post(RequestBody));
    }

    public ResponseBody put(String endpoint, Object object) throws IOException, RestException {
        RequestBody body = RequestBody.create(jsonMediaType, JSON.toJSONString(object));
        return request(new Request.Builder().url(server + endpoint).put(body));
    }

    public ResponseBody delete(String endpoint) throws IOException, RestException {
        return request(new Request.Builder().url(server + endpoint).delete());
    }

    public ResponseBody postBinary(String endpoint, String name, String fileName, String mediaType, byte[] fileContent) throws IOException, RestException {
        RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.FORM)
            .addFormDataPart(name, fileName, RequestBody.create(MediaType.parse(mediaType), fileContent))
            .build();
        return request(new Request.Builder().url(server + endpoint).post(requestBody));
    }

    public <T> T get(String endpoint, Type type, QueryParameter... queryParameters) throws IOException, RestException {
        return JSON.parseObject(get(endpoint, queryParameters).string(), type);
    }

    public <T> T post(String endpoint, FormBody formBody, Type type) throws IOException, RestException {
        return JSON.parseObject(post(endpoint, formBody).string(), type);
    }

    public <T> T post(String endpoint, Object object, Type type) throws IOException, RestException {
        return JSON.parseObject(post(endpoint, object).string(), type);
    }

    public <T> T put(String endpoint, Object object, Type type) throws IOException, RestException {
        return JSON.parseObject(put(endpoint, object).string(), type);
    }

    public static final class QueryParameter {
        String key;
        String value;

        QueryParameter(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
