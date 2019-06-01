package com.ringcentral;

import com.alibaba.fastjson.JSON;
import com.ringcentral.definitions.Attachment;
import com.ringcentral.definitions.GetTokenRequest;
import com.ringcentral.definitions.RevokeTokenRequest;
import com.ringcentral.definitions.TokenInfo;
import okhttp3.*;
import okio.BufferedSink;

import java.io.IOException;
import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.*;

public class RestClient {
    public static final String SANDBOX_SERVER = "https://platform.devtest.ringcentral.com";
    public static final String PRODUCTION_SERVER = "https://platform.ringcentral.com";
    private static final MediaType jsonMediaType = MediaType.parse("application/json; charset=utf-8");
    public String clientId;
    public String clientSecret;
    public String server;
    public OkHttpClient httpClient;
    public TokenInfo token;

    public RestClient(String clientId, String clientSecret, String server, OkHttpClient okHttpClient) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.server = server;
        if (okHttpClient == null) {
            this.httpClient = new OkHttpClient();
        } else {
            this.httpClient = okHttpClient;
        }
    }

    public RestClient(String clientId, String clientSecret, String server) {
        this(clientId, clientSecret, server, null);
    }

    public RestClient(String clientId, String clientSecret, Boolean production, OkHttpClient okHttpClient) {
        this(clientId, clientSecret, production ? PRODUCTION_SERVER : SANDBOX_SERVER, okHttpClient);
    }

    public RestClient(String clientId, String clientSecret, Boolean production) {
        this(clientId, clientSecret, production, null);
    }


    private String basicKey() {
        return new String(Base64.getEncoder().encode(MessageFormat.format("{0}:{1}", clientId, clientSecret).getBytes()));
    }

    private String authorizationHeader() {
        if (token != null) {
            return MessageFormat.format("Bearer {0}", token.access_token);
        }
        return MessageFormat.format("Basic {0}", basicKey());
    }

    public void revoke() throws IOException, RestException {
        if (token == null) {
            return;
        }
        RevokeTokenRequest revokeTokenRequest = new RevokeTokenRequest().token(token.access_token);
        token = null;
        this.restapi(null).oauth().revoke().post(revokeTokenRequest);
    }

    public TokenInfo authorize(String username, String extension, String password) throws IOException, RestException {
        GetTokenRequest getTokenRequest = new GetTokenRequest()
                .grant_type("password")
                .username(username)
                .extension(extension)
                .password(password);
        return authorize(getTokenRequest);
    }

    public TokenInfo authorize(GetTokenRequest getTokenRequest) throws IOException, RestException {
        token = null;
        token = this.restapi(null).oauth().token().post(getTokenRequest);
        return token;
    }

    public ResponseBody get(String endpoint) throws IOException, RestException {
        return request(HttpMethod.GET, endpoint, null, null);
    }

    public ResponseBody get(String endpoint, Object queryParameters) throws IOException, RestException {
        return request(HttpMethod.GET, endpoint, queryParameters, null);
    }

    public ResponseBody delete(String endpoint) throws IOException, RestException {
        return request(HttpMethod.DELETE, endpoint, null, null);
    }

    public ResponseBody delete(String endpoint, Object queryParameters) throws IOException, RestException {
        return request(HttpMethod.DELETE, endpoint, queryParameters, null);
    }

    public ResponseBody post(String endpoint) throws IOException, RestException {
        return request(HttpMethod.POST, endpoint, null, null, ContentType.JSON);
    }

    public ResponseBody post(String endpoint, Object object) throws IOException, RestException {
        return request(HttpMethod.POST, endpoint, null, object, ContentType.JSON);
    }

    public ResponseBody post(String endpoint, Object object, Object queryParameters) throws IOException, RestException {
        return request(HttpMethod.POST, endpoint, queryParameters, object, ContentType.JSON);
    }

    public ResponseBody post(String endpoint, Object object, Object queryParameters, ContentType contentType) throws IOException, RestException {
        return request(HttpMethod.POST, endpoint, queryParameters, object, contentType);
    }

    public ResponseBody put(String endpoint) throws IOException, RestException {
        return request(HttpMethod.PUT, endpoint, null, null);
    }

    public ResponseBody put(String endpoint, Object object) throws IOException, RestException {
        return request(HttpMethod.PUT, endpoint, null, object);
    }

    public ResponseBody put(String endpoint, Object object, Object queryParameters) throws IOException, RestException {
        return request(HttpMethod.PUT, endpoint, queryParameters, object);
    }

    public ResponseBody put(String endpoint, Object object, Object queryParameters, ContentType contentType) throws IOException, RestException {
        return request(HttpMethod.PUT, endpoint, queryParameters, object, contentType);
    }

    public ResponseBody patch(String endpoint, Object object) throws IOException, RestException {
        return request(HttpMethod.PATCH, endpoint, null, object);
    }

    public ResponseBody patch(String endpoint, Object object, Object queryParameters) throws IOException, RestException {
        return request(HttpMethod.PATCH, endpoint, queryParameters, object);
    }

    public ResponseBody request(HttpMethod httpMethod, String endpoint, Object queryParameters, Object body) throws IOException, RestException {
        return request(httpMethod, endpoint, queryParameters, body, ContentType.JSON);
    }

    public ResponseBody request(HttpMethod httpMethod, String endpoint, Object queryParameters, Object body, ContentType contentType) throws IOException, RestException {
        RequestBody requestBody = null;
        switch (contentType) {
            case JSON:
                requestBody = RequestBody.create(jsonMediaType, JSON.toJSONString(body));
                break;
            case FORM:
                FormBody.Builder formBodyBuilder = new FormBody.Builder();
                for (Field field : body.getClass().getFields()) {
                    Object value = null;
                    try {
                        value = field.get(body);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    if (value != null) {
                        formBodyBuilder = formBodyBuilder.add(field.getName(), value.toString());
                    }
                }
                requestBody = formBodyBuilder.build();
                break;
            case MULTIPART:
                MultipartBody.Builder multipartBodyBuilder = new MultipartBody.Builder();
                List<Attachment> attachments = new ArrayList<Attachment>();
                Map<String, Object> fields = new HashMap<String, Object>();
                String attachmentName = "attachment";
                for (Field field : body.getClass().getFields()) {
                    Object value = null;
                    try {
                        value = field.get(body);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    if (value != null) {
                        if (field.getType() == Attachment.class) {
                            attachmentName = field.getName();
                            attachments.add((Attachment) value);
                        } else if (field.getType() == Attachment[].class) {
                            for (Attachment a : (Attachment[]) value) {
                                attachments.add(a);
                            }
                        } else {
                            fields.put(field.getName(), value);
                        }
                    }
                }
                if (fields.size() > 0) {
                    multipartBodyBuilder.addPart(RequestBody.create(jsonMediaType, JSON.toJSONString(fields)));
                }
                for (Attachment attachment : attachments) {
                    multipartBodyBuilder.addFormDataPart(attachmentName, attachment.fileName, new RequestBody() {
                        @Override
                        public MediaType contentType() {
                            if (attachment.contentType == null) {
                                return null;
                            }
                            return MediaType.parse(attachment.contentType);
                        }

                        @Override
                        public void writeTo(BufferedSink sink) throws IOException {
                            sink.write(attachment.bytes);
                        }
                    });
                }
                requestBody = multipartBodyBuilder.setType(MultipartBody.FORM).build();
                break;
            default:
                break;
        }
        return request(httpMethod, endpoint, queryParameters, requestBody);
    }

    public ResponseBody request(HttpMethod httpMethod, String endpoint, Object queryParameters, RequestBody
            requestBody) throws IOException, RestException {
        HttpUrl.Builder urlBuilder = HttpUrl.parse(server).newBuilder(endpoint);

        if (queryParameters != null) {
            for (Field field : queryParameters.getClass().getFields()) {
                Object value = null;
                try {
                    value = field.get(queryParameters);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (value != null) {
                    urlBuilder = urlBuilder.addQueryParameter(field.getName(), value.toString());
                }
            }
        }

        HttpUrl httpUrl = urlBuilder.build();

        Request.Builder builder = new Request.Builder().url(httpUrl);
        switch (httpMethod) {
            case GET:
                builder = builder.get();
                break;
            case POST:
                builder = builder.post(requestBody);
                break;
            case PUT:
                builder = builder.put(requestBody);
                break;
            case DELETE:
                builder = builder.delete();
                break;
            case PATCH:
                builder = builder.patch(requestBody);
                break;
            default:
                break;
        }

        String userAgentHeader = String.format("RC-JAVA-SDK Java %s %s", System.getProperty("java.version"), System.getProperty("os.name"));
        Request request = builder.addHeader("Authorization", authorizationHeader())
                .addHeader("X-User-Agent", userAgentHeader)
                .build();

        Response response = httpClient.newCall(request).execute();
        int statusCode = response.code();
        if (statusCode < 200 || statusCode > 299) {
            throw new RestException(request, response);
        }
        return response.body();
    }

    // top level paths
    public com.ringcentral.paths.restapi.Index restapi(String apiVersion) {
        return new com.ringcentral.paths.restapi.Index(this, apiVersion);
    }

    public com.ringcentral.paths.restapi.Index restapi() {
        return new com.ringcentral.paths.restapi.Index(this, "v1.0");
    }

    public com.ringcentral.paths.scim.Index scim(String version) {
        return new com.ringcentral.paths.scim.Index(this, version);
    }

    public com.ringcentral.paths.scim.Index scim() {
        return new com.ringcentral.paths.scim.Index(this, "v2");
    }
}
