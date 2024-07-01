package com.ringcentral.paths.restapi.oauth.revoke;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.RevokeTokenParameters;
import com.ringcentral.definitions.RevokeTokenRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.oauth.Index parent;

    public Index(com.ringcentral.paths.restapi.oauth.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/revoke";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Revokes all active access/refresh tokens and invalidates the OAuth session basing on token provided.
     * The `token` parameter may be passed in query string or body and may represent access or refresh token.
     * <p>
     * This endpoint is defined by [RFC-7009 &quot;OAuth 2.0 Token Revocation&quot;](https://datatracker.ietf.org/doc/html/rfc7009)
     * <p>
     * For confidential client application types
     * this endpoint requires client authentication using one of the supported
     * methods (`client_secret_basic`, `client_secret_jwt` or `private_key_jwt`)
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/oauth/revoke
     * Rate Limit Group: Auth
     */
    public String post(RevokeTokenRequest revokeTokenRequest, RevokeTokenParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), revokeTokenRequest, queryParams, com.ringcentral.ContentType.FORM);
        return rb.string();
    }

    public String post(RevokeTokenRequest revokeTokenRequest) throws com.ringcentral.RestException, java.io.IOException {
        return this.post(revokeTokenRequest, null);
    }
}
