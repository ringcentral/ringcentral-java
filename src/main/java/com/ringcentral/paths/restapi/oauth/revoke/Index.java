package com.ringcentral.paths.restapi.oauth.revoke;

import com.ringcentral.RestClient;
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

    /**
     * Revokes access/refresh token. Requests to this endpoint must be authenticated with HTTP Basic scheme using the application key and application secret as login and password, correspondingly.
     * HTTP Method: post
     * Endpoint: /restapi/oauth/revoke
     * Rate Limit Group: Auth
     */
    public String post(RevokeTokenRequest revokeTokenRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), revokeTokenRequest, null, com.ringcentral.ContentType.FORM);
        return rb.string();
    }
}
