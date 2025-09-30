package com.ringcentral;

import com.ringcentral.definitions.Attachment;
import com.ringcentral.definitions.GetTokenRequest;
import com.ringcentral.definitions.RevokeTokenRequest;
import com.ringcentral.definitions.TokenInfo;
import okhttp3.*;
import okio.BufferedSink;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class RestClient {
    public static final String PRODUCTION_SERVER = "https://platform.ringcentral.com";
    private static final MediaType jsonMediaType = MediaType.parse("application/json; charset=utf-8");
    private static final MediaType textMediaType = MediaType.parse("text/plain; charset=utf-8");
    public static Logger logger = Logger.getLogger("com.ringcentral");
    public String clientId;
    public String clientSecret;
    public String server;
    public OkHttpClient httpClient;
    public TokenInfo token;
    public List<HttpEventListener> httpEventListeners = new ArrayList<>();

    public RestClient(String clientId, String clientSecret, String server, OkHttpClient okHttpClient) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.server = server;
        if (okHttpClient == null) {
            this.httpClient = new OkHttpClient.Builder()
                .connectTimeout(5, TimeUnit.MINUTES)
                .writeTimeout(5, TimeUnit.MINUTES)
                .readTimeout(5, TimeUnit.MINUTES)
                .build();
        } else {
            this.httpClient = okHttpClient;
        }
    }

    public RestClient(String clientId, String clientSecret, String server) {
        this(clientId, clientSecret, server, null);
    }


    public RestClient(String clientId, String clientSecret, OkHttpClient okHttpClient) {
        this(clientId, clientSecret, PRODUCTION_SERVER, okHttpClient);
    }

    public RestClient(String clientId, String clientSecret) {
        this(clientId, clientSecret, (OkHttpClient) null);
    }

    public void autoRefresh(long period) {
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    refresh();
                } catch (IOException | RestException e) {
                    e.printStackTrace();
                }
            }
        }, 0, period);
    }

    public void autoRefresh() {
        this.autoRefresh(1000L * 60 * 30);
    }

    public TokenInfo refresh() throws IOException, RestException {
        GetTokenRequest getTokenRequest = new GetTokenRequest()
            .grant_type("refresh_token")
            .refresh_token(token.refresh_token);
        return authorize(getTokenRequest);
    }

    private String basicKey() {
        return new String(Base64.getEncoder().encode(MessageFormat.format("{0}:{1}", clientId, clientSecret).getBytes()));
    }

    private String authorizationHeader(String endpoint) {
        if (endpoint.equals("/restapi/oauth/token") || endpoint.equals("/restapi/oauth/revoke")) {
            return MessageFormat.format("Basic {0}", basicKey());
        }
        return MessageFormat.format("Bearer {0}", token.access_token);
    }

    public void revoke() throws IOException, RestException {
        if (token == null) {
            return;
        }
        RevokeTokenRequest revokeTokenRequest = new RevokeTokenRequest().token(token.access_token);
        this.restapi(null).oauth().revoke().post(revokeTokenRequest);
        token = null;
    }

    public TokenInfo authorize(String authCode, String redirectUri) throws IOException, RestException {
        GetTokenRequest getTokenRequest = new GetTokenRequest()
            .grant_type("authorization_code")
            .code(authCode)
            .redirect_uri(redirectUri);
        return authorize(getTokenRequest);
    }

    public TokenInfo authorize(String jwt) throws IOException, RestException {
        GetTokenRequest getTokenRequest = new GetTokenRequest()
            .grant_type("urn:ietf:params:oauth:grant-type:jwt-bearer")
            .assertion(jwt);
        return authorize(getTokenRequest);
    }

    public TokenInfo authorize(GetTokenRequest getTokenRequest) throws IOException, RestException {
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

    public ResponseBody delete(String endpoint, Object object, Object queryParameters) throws IOException, RestException {
        return request(HttpMethod.DELETE, endpoint, queryParameters, object, ContentType.JSON);
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
                if (body != null && body.getClass().equals(String.class)) { // PUT text
                    requestBody = RequestBody.create((String) body, textMediaType);
                } else {
                    requestBody = RequestBody.create(body == null ? "" : Utils.gson.toJson(body), jsonMediaType);
                }
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
                    multipartBodyBuilder.addPart(RequestBody.create(Utils.gson.toJson(fields), jsonMediaType));
                }
                for (Attachment attachment : attachments) {
                    multipartBodyBuilder.addFormDataPart(attachmentName, attachment.filename, new RequestBody() {
                        @Override
                        public MediaType contentType() {
                            if (attachment.contentType == null) {
                                return null;
                            }
                            return MediaType.parse(attachment.contentType);
                        }

                        @Override
                        public void writeTo(BufferedSink sink) throws IOException {
                            sink.write(attachment.content);
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

    // this method returns the raw response instead of just the body
    public Response requestRaw(HttpMethod httpMethod, String endpoint, Object queryParameters, RequestBody
        requestBody) throws IOException, RestException {
        HttpUrl.Builder urlBuilder;
        if (endpoint.startsWith("https://") || endpoint.startsWith("http://")) {
            // example: https://media.ringcentral.com/restapi/v1.0/account/809646016/ivr-prompts/838195017/content
            urlBuilder = HttpUrl.parse(endpoint).newBuilder();
        } else {
            // special case: server has path segments, like http://xmn-mck01.int.rclabenv.com:65003/pubapi
            // rEndpoint is relative endpoint
            String rEndpoint = endpoint.startsWith("/") ? endpoint.substring(1) : endpoint;
            urlBuilder = HttpUrl.parse(server).newBuilder().addPathSegments(rEndpoint);
        }

        if (queryParameters != null) {
            for (Field field : queryParameters.getClass().getFields()) {
                Object value = null;
                try {
                    value = field.get(queryParameters);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (value != null) {
                    if (value.getClass().isArray()) { // ?a=hello&a=world
                        for (int i = 0; i < Array.getLength(value); i++) {
                            urlBuilder = urlBuilder.addQueryParameter(field.getName(), Array.get(value, i).toString());
                        }
                    } else {
                        urlBuilder = urlBuilder.addQueryParameter(field.getName(), value.toString());
                    }
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
                builder = builder.delete(requestBody);
                break;
            case PATCH:
                builder = builder.patch(requestBody);
                break;
            default:
                break;
        }

        String userAgentHeader = String.format("RC-JAVA-SDK Java %s %s", System.getProperty("java.version"), System.getProperty("os.name"));
        Request request = builder.addHeader("Authorization", authorizationHeader(endpoint))
            .addHeader("X-User-Agent", userAgentHeader)
            .build();

        Response response = httpClient.newCall(request).execute();
        int statusCode = response.code();
        if (statusCode < 200 || statusCode > 299) {
            throw new RestException(response, request);
        }
        for (HttpEventListener httpEventListener : httpEventListeners) {
            httpEventListener.afterHttpCall(response, request);
        }
        return response;
    }

    public ResponseBody request(HttpMethod httpMethod, String endpoint, Object queryParameters, RequestBody
        requestBody) throws IOException, RestException {
        try {
            Response response = requestRaw(httpMethod, endpoint, queryParameters, requestBody);
            logger.fine(String.format("[HTTP %s %s] %s, rc-request-id: %s", httpMethod.toString(), response.code(), endpoint, response.header("rcrequestid")));
            return response.peekBody(Long.MAX_VALUE);
        } catch (RestException re) {
            Response response = re.response;
            logger.warning(String.format("[HTTP %s %s] %s, rc-request-id: %s", httpMethod.toString(), response.code(), endpoint, response.header("rcrequestid")));
            throw re;
        }
    }

    public String authorizeUri(AuthorizeRequest request) {
        if (request.response_type == null) {
            request.response_type = "code";
        }

        if (request.client_id == null) {
            request.client_id = clientId;
        }
        HttpUrl.Builder urlBuilder = HttpUrl.parse(this.server).newBuilder().addPathSegments("restapi/oauth/authorize");
        for (Field field : request.getClass().getFields()) {
            Object value = null;
            try {
                value = field.get(request);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (value != null) {
                urlBuilder = urlBuilder.addQueryParameter(field.getName(), value.toString());
            }
        }
        return urlBuilder.build().toString();
    }

    public String authorizeUri(String redirectUri, String state) {
        AuthorizeRequest authorizeRequest = new AuthorizeRequest().redirect_uri(redirectUri).state(state);
        return authorizeUri(authorizeRequest);
    }

    public String authorizeUri(String redirectUri) {
        return authorizeUri(redirectUri, "");
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

    public com.ringcentral.paths.analytics.Index analytics() {
        return new com.ringcentral.paths.analytics.Index(this);
    }

    public com.ringcentral.paths.teammessaging.Index teamMessaging() {
        return new com.ringcentral.paths.teammessaging.Index(this);
    }

    public com.ringcentral.paths.ai.Index ai() {
        return new com.ringcentral.paths.ai.Index(this);
    }

    public com.ringcentral.paths.rcvideo.Index rcvideo() {
        return new com.ringcentral.paths.rcvideo.Index(this);
    }

    public com.ringcentral.paths.webinar.Index webinar() {
        return new com.ringcentral.paths.webinar.Index(this);
    }

    // todo: this is temporary, it will be removed when AuthorizeRequest is back to spec
    class AuthorizeRequest {
        public String response_type;
        public String client_id;
        public String redirect_uri;
        public String state;
        public String ui_options;
        public String code_challenge;
        public String code_challenge_method;

        public AuthorizeRequest response_type(String response_type) {
            this.response_type = response_type;
            return this;
        }

        public AuthorizeRequest client_id(String client_id) {
            this.client_id = client_id;
            return this;
        }

        public AuthorizeRequest redirect_uri(String redirect_uri) {
            this.redirect_uri = redirect_uri;
            return this;
        }

        public AuthorizeRequest state(String state) {
            this.state = state;
            return this;
        }

        public AuthorizeRequest ui_options(String ui_options) {
            this.ui_options = ui_options;
            return this;
        }

        public AuthorizeRequest code_challenge(String code_challenge) {
            this.code_challenge = code_challenge;
            return this;
        }

        public AuthorizeRequest code_challenge_method(String code_challenge_method) {
            this.code_challenge_method = code_challenge_method;
            return this;
        }
    }
}
