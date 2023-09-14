package com.ringcentral.paths.restapi.oauth.revoke;

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
        return parent.path() + "/revoke";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Revokes previously issued access and refresh token.
     * <p>
     * Depending on client application type
     * requests to this endpoint may require authentication with HTTP Basic scheme
     * using registered client ID and client secret as login and password, correspondingly.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/oauth/revoke
     * Rate Limit Group: Auth
     */
    public String post(RevokeTokenRequest revokeTokenRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), revokeTokenRequest, null, com.ringcentral.ContentType.FORM);
        return rb.string();
    }
}
