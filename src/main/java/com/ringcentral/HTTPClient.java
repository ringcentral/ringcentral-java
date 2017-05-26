package com.ringcentral;

import com.alibaba.fastjson.JSON;
import okhttp3.*;

import java.io.IOException;
import java.lang.reflect.Type;

public abstract class HTTPClient {

    private static final MediaType jsonMediaType = MediaType.parse("application/json; charset=utf-8");
    protected String server;

    public abstract ResponseBody request(Request.Builder builder) throws IOException, RestException;

    private HttpUrl buildUrl(String endpoint, QueryParameter... queryParameters) {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(server).newBuilder(endpoint);
        for (QueryParameter queryParameter : queryParameters) {
            urlBuilder = urlBuilder.addQueryParameter(queryParameter.key, queryParameter.value);
        }
        return urlBuilder.build();
    }

    public ResponseBody get(String endpoint, QueryParameter... queryParameters) throws IOException, RestException {
        HttpUrl url = buildUrl(endpoint, queryParameters);
        return request(new Request.Builder().url(url));
    }

    public ResponseBody post(String endpoint, HttpModel object, QueryParameter... queryParameters) throws IOException, RestException {
        RequestBody body = RequestBody.create(jsonMediaType, JSON.toJSONString(object));
        HttpUrl url = buildUrl(endpoint, queryParameters);
        return request(new Request.Builder().url(url).post(body));
    }

    public ResponseBody post(String endpoint, RequestBody requestBody, QueryParameter... queryParameters) throws IOException, RestException {
        HttpUrl url = buildUrl(endpoint, queryParameters);
        return request(new Request.Builder().url(url).post(requestBody));
    }

    public ResponseBody put(String endpoint, HttpModel object, QueryParameter... queryParameters) throws IOException, RestException {
        RequestBody body = RequestBody.create(jsonMediaType, JSON.toJSONString(object));
        HttpUrl url = buildUrl(endpoint, queryParameters);
        return request(new Request.Builder().url(url).put(body));
    }

    public ResponseBody delete(String endpoint, QueryParameter... queryParameters) throws IOException, RestException {
        HttpUrl url = buildUrl(endpoint, queryParameters);
        return request(new Request.Builder().url(url).delete());
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

    public <T> T post(String endpoint, FormBody formBody, Type type, QueryParameter... queryParameters) throws IOException, RestException {
        return JSON.parseObject(post(endpoint, formBody, queryParameters).string(), type);
    }

    public <T> T post(String endpoint, HttpModel object, Type type, QueryParameter... queryParameters) throws IOException, RestException {
        return JSON.parseObject(post(endpoint, object, queryParameters).string(), type);
    }

    public <T> T put(String endpoint, HttpModel object, Type type, QueryParameter... queryParameters) throws IOException, RestException {
        return JSON.parseObject(put(endpoint, object, queryParameters).string(), type);
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
