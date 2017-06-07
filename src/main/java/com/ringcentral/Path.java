package com.ringcentral;

import okhttp3.FormBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.IOException;
import java.lang.reflect.Type;

public abstract class Path {
    protected PathSegment pathSegment;

    protected RestClient restClient;

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public ResponseBody get(HttpClient.QueryParameter... queryParameters) throws IOException, RestException {
        return restClient.get(endpoint(), queryParameters);
    }

    public ResponseBody post(Object object, HttpClient.QueryParameter... queryParameters) throws IOException, RestException {
        return restClient.post(endpoint(), object, queryParameters);
    }

    public ResponseBody post(RequestBody requestBody, HttpClient.QueryParameter... queryParameters) throws IOException, RestException {
        return restClient.post(endpoint(), requestBody, queryParameters);
    }

    public ResponseBody put(Object object, HttpClient.QueryParameter... queryParameters) throws IOException, RestException {
        return restClient.put(endpoint(), object, queryParameters);
    }

    public ResponseBody delete(HttpClient.QueryParameter... queryParameters) throws IOException, RestException {
        return restClient.delete(endpoint(), queryParameters);
    }

    public ResponseBody postBinary(String name, String fileName, String mediaType, byte[] fileContent) throws IOException, RestException {
        return restClient.postBinary(endpoint(), name, fileName, mediaType, fileContent);
    }

    public <T> T get(Type type, HttpClient.QueryParameter... queryParameters) throws IOException, RestException {
        return restClient.get(endpoint(), type, queryParameters);
    }

    public <T> T post(FormBody formBody, Type type, HttpClient.QueryParameter... queryParameters) throws IOException, RestException {
        return restClient.post(endpoint(), formBody, type, queryParameters);
    }

    public <T> T post(Object object, Type type, HttpClient.QueryParameter... queryParameters) throws IOException, RestException {
        return restClient.post(endpoint(), object, type, queryParameters);
    }

    public <T> T put(Object object, Type type, HttpClient.QueryParameter... queryParameters) throws IOException, RestException {
        return restClient.post(endpoint(), object, type, queryParameters);
    }
}
