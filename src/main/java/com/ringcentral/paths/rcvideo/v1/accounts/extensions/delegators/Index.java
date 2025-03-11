package com.ringcentral.paths.rcvideo.v1.accounts.extensions.delegators;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v1.accounts.extensions.Index parent;

    public Index(com.ringcentral.paths.rcvideo.v1.accounts.extensions.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/delegators";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns the list of users who can delegate bridge/meeting creation to the given user.
     * HTTP Method: get
     * Endpoint: /rcvideo/v1/accounts/{accountId}/extensions/{extensionId}/delegators
     * Rate Limit Group: Medium
     * App Permission: Video
     */
    public DelegatorsListResult get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), DelegatorsListResult.class);
    }
}
