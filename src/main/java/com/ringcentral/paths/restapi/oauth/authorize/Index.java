package com.ringcentral.paths.restapi.oauth.authorize;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AuthorizeRequest;

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

    /**
     * Returns a link to a login page location.
     * HTTP Method: post
     * Endpoint: /restapi/oauth/authorize
     */
    public String post(AuthorizeRequest authorizeRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), authorizeRequest, null, com.ringcentral.ContentType.FORM);
        return rb.string();
    }
}
