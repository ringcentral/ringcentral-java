package com.ringcentral.paths.restapi.oauth.token;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GetTokenRequest;
import com.ringcentral.definitions.TokenInfo;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.oauth.Index parent;

    public Index(com.ringcentral.paths.restapi.oauth.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/token";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns access (and potentially refresh) tokens for making API requests.
     * <p>
     * Depending on client application type
     * requests to this endpoint may require authentication with HTTP Basic scheme
     * using registered client ID and client secret as login and password, correspondingly.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/oauth/token
     * Rate Limit Group: Auth
     */
    public TokenInfo post(GetTokenRequest getTokenRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), getTokenRequest, null, com.ringcentral.ContentType.FORM);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TokenInfo.class);
    }
}
