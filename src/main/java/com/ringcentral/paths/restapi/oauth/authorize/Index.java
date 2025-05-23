package com.ringcentral.paths.restapi.oauth.authorize;

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
        return parent.path() + "/authorize";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Performs Authentication of the End-User by sending the User Agent to the Authorization Server&#039;s
     * Authorization Endpoint for Authentication and Authorization,
     * using request parameters defined by OAuth 2.0 [RFC-6749](https://datatracker.ietf.org/doc/html/rfc6749#section-3.1)
     * and additional parameters and parameter values defined by
     * [OpenID Connect Core 1.0](https://openid.net/specs/openid-connect-core-1_0.html#AuthorizationEndpoint).
     * <p>
     * This is the version that uses HTTP `GET` method.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/oauth/authorize
     * Rate Limit Group: Auth
     */
    public String get(AuthorizeParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return rb.string();
    }

    public String get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
