package com.ringcentral.paths.restapi.oauth.jwks;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.JWKeySet;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.oauth.Index parent;

    public Index(com.ringcentral.paths.restapi.oauth.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/jwks";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the signing key(s) in JWK Set format. Client use it to validate signatures of any JWT
     * (e.g. OpenID Connect ID Token) issued by the Authorization Server
     * (see [RFC-7517](https://www.rfc-editor.org/rfc/rfc7517.html#section-5))
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/oauth/jwks
     * Rate Limit Group: NoThrottling
     */
    public JWKeySet get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), JWKeySet.class);
    }
}
