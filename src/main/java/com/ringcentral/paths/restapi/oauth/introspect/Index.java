package com.ringcentral.paths.restapi.oauth.introspect;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.IntrospectTokenRequest;
import com.ringcentral.definitions.TokenIntrospectionResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.oauth.Index parent;

    public Index(com.ringcentral.paths.restapi.oauth.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/introspect";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Determines state and metadata for a given token (access token, refresh token
     * or authorization code)
     * <p>
     * Depending on client application type
     * requests to this endpoint may require authentication with HTTP Basic scheme
     * using registered client ID and client secret as login and password, correspondingly.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/oauth/introspect
     * Rate Limit Group: Auth
     * App Permission: Interoperability
     */
    public TokenIntrospectionResponse post(IntrospectTokenRequest introspectTokenRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), introspectTokenRequest, null, com.ringcentral.ContentType.FORM);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TokenIntrospectionResponse.class);
    }
}
