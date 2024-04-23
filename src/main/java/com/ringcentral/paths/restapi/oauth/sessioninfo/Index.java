package com.ringcentral.paths.restapi.oauth.sessioninfo;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.SessionInfoResponse;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.oauth.Index parent;

    public Index(com.ringcentral.paths.restapi.oauth.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/session-info";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns information about current OAuth session
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/oauth/session-info
     * Rate Limit Group: Auth
     */
    public SessionInfoResponse get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SessionInfoResponse.class);
    }
}
