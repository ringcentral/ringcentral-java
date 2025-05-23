package com.ringcentral.paths.restapi.oauth.token;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

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
     * methods:
     * - `client_secret_basic` - client ID and client secret must be provided via `Authorization` header as described in
     * [RFC-6749](https://datatracker.ietf.org/doc/html/rfc6749#section-2.3.1).
     * - `client_secret_jwt` / `private_key_jwt` -- `client_assertion` attribute should be used to pass a signed JWT as described in
     * [RFC-7523](https://datatracker.ietf.org/doc/html/rfc7523#section-2.2).
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
