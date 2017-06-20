package com.ringcentral;

import com.ringcentral.definitions.TokenInfo;
import com.ringcentral.paths.Restapi;
import okhttp3.*;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Base64;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Consumer;

public class RestClient extends HttpClient {
    public static final String SANDBOX_SERVER = "https://platform.devtest.ringcentral.com";
    public static final String PRODUCTION_SERVER = "https://platform.ringcentral.com";
    private static final OkHttpClient httpClient = new OkHttpClient();
    public boolean autoRefresh = true;
    public String userAgent = "";
    private String appKey;
    private String appSecret;
    private TokenInfo _token;
    private Timer timer;

    public RestClient(String appKey, String appSecret, String server) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.server = server;
    }

    public TokenInfo getToken() {
        return _token;
    }

    public void setToken(TokenInfo token) {
        _token = token;
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
        if (autoRefresh && token != null) {
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    refresh();
                }
            }, (token.expires_in - 120) * 1000);
        }
    }

    public void authorize(String username, String extension, String password) throws IOException, RestException {
        FormBody formBody = new FormBody.Builder()
            .add("grant_type", "password")
            .add("username", username)
            .add("extension", extension)
            .add("password", password)
            .build();
        setToken(null);
        TokenInfo tokenInfo = post("/restapi/oauth/token", formBody, TokenInfo.class);
        setToken(tokenInfo);
    }

    public void authorize(String auth_code, String redirectUri) throws IOException, RestException {
        FormBody formBody = new FormBody.Builder()
            .add("grant_type", "authorization_code")
            .add("code", auth_code)
            .add("redirect_uri", redirectUri)
            .build();
        setToken(null);
        TokenInfo tokenInfo = post("/restapi/oauth/token", formBody, TokenInfo.class);
        setToken(tokenInfo);
    }

    public void refresh() {
        if (getToken() == null) {
            return;
        }
        FormBody formBody = new FormBody.Builder()
            .add("grant_type", "refresh_token")
            .add("refresh_token", getToken().refresh_token)
            .build();
        setToken(null);
        try {
            TokenInfo tokenInfo = post("/restapi/oauth/token", formBody, TokenInfo.class);
            setToken(tokenInfo);
        } catch (IOException | RestException e) {
            e.printStackTrace();
        }
    }

    public void revoke() throws IOException, RestException {
        if (getToken() == null) {
            return;
        }
        FormBody formBody = new FormBody.Builder()
            .add("token", getToken().access_token)
            .build();
        setToken(null);
        post("/restapi/oauth/revoke", formBody);
    }

    public String authorizeUri(String redirectUri, String state) {
        return HttpUrl.parse(server).newBuilder("/restapi/oauth/authorize")
            .addQueryParameter("response_type", "code")
            .addQueryParameter("state", state)
            .addQueryParameter("redirect_uri", redirectUri)
            .addQueryParameter("client_id", appKey)
            .build().toString();
    }

    public String authorizeUri(String redirectUri) {
        return authorizeUri(redirectUri, "");
    }

    public Subscription subscription(String[] events, Consumer<String> callback) {
        return new Subscription(this, events, callback);
    }

    private String basicKey() {
        return new String(Base64.getEncoder().encode(MessageFormat.format("{0}:{1}", appKey, appSecret).getBytes()));
    }

    private String authorizationHeader() {
        if (getToken() != null) {
            return MessageFormat.format("Bearer {0}", getToken().access_token);
        }
        return MessageFormat.format("Basic {0}", basicKey());
    }

    public ResponseBody request(Request.Builder builder) throws IOException, RestException {
        String userAgentHeader = String.join(" ", new String[]{"RC-JAVA-SDK", userAgent});
        Request request = builder.addHeader("Authorization", authorizationHeader())
            .addHeader("User-Agent", userAgentHeader)
            .addHeader("RC-User-Agent", userAgentHeader)
            .build();
        Response response = httpClient.newCall(request).execute();
        int statusCode = response.code();
        if (statusCode < 200 || statusCode > 299) {
            throw new RestException(statusCode, response.body().string());
        }
        return response.body();
    }

    public Restapi restApi(String id) {
        return new Restapi(this, null, id);
    }

    public Restapi restApi() {
        return restApi("v1.0");
    }
}
