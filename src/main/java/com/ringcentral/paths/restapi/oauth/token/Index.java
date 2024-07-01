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
     * For confidential client application types
     * this endpoint requires client authentication using one of the supported
     * methods (`client_secret_basic`, `client_secret_jwt` or `private_key_jwt`)
     * <p>
     * For non-confidential client application types
     * the client identifier must be provided via `client_id` request attribute.
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
