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
     * Performs OAuth 2.0 authorization (GET version)
     * HTTP Method: get
     * Endpoint: /restapi/oauth/authorize
     * Rate Limit Group: Auth
     */
    public String get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return rb.string();
    }

    /**
     * Performs OAuth 2.0 authorization (POST version)
     * HTTP Method: post
     * Endpoint: /restapi/oauth/authorize
     * Rate Limit Group: Auth
     */
    public String post(AuthorizeRequest authorizeRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), authorizeRequest, null, com.ringcentral.ContentType.FORM);
        return rb.string();
    }
}
