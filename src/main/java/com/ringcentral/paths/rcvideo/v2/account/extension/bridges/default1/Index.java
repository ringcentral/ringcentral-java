package com.ringcentral.paths.rcvideo.v2.account.extension.bridges.default1;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.rcvideo.v2.account.extension.bridges.Index parent;

    public Index(com.ringcentral.paths.rcvideo.v2.account.extension.bridges.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/default";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a default bridge (PMI) for the user specified by **accountId**
     * and **extensionId** identifiers.
     * <p>
     * HTTP Method: get
     * Endpoint: /rcvideo/v2/account/{accountId}/extension/{extensionId}/bridges/default
     * Rate Limit Group: Medium
     * App Permission: Video
     */
    public BridgeResponse get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), BridgeResponse.class);
    }
}
